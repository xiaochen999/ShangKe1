package Day6_1.Lian1;

import java.util.*;

//   工具类
public class CardUilt {
    Scanner sc = new Scanner(System.in);
    private Map<String,MobileCard> cards = new HashMap<String, MobileCard>();   //  已注册的移动卡用户列表
    private Map<Integer,Scene>  scene= new HashMap<Integer,Scene>();   // 保存场景列表

    //   用户注册登录
    public void addCard (MobileCard mobileCard){

        String [] ArrsPhone = new String[9];
        for (int i = 0; i < 9; i++) {
            if (ArrsPhone[i] == null){
              ArrsPhone[i] = getNewNumber(9)[i] ;
            }
            if ((i+1)%3==0){
                System.out.println( (i+1)+". "+ArrsPhone[i]+ "  ");
            }else {
                System.out.print( (i+1)+". "+ArrsPhone[i]+ "  ");
            }
        }

        System.out.println("请选择卡号：");
        int num = sc.nextInt();
        mobileCard.setCardNumber(ArrsPhone[num - 1]);   // 将选择的卡号 ArrsPhone[num - 1] 存入
        System.out.print("1.话痨套餐 2.网虫套餐 3.超人套餐，请选择套餐（输入序号）：");
        int selectNumber = sc.nextInt();
        mobileCard.setServicePackage(creatPack(selectNumber));   // 存入所选的套餐类型
        System.out.print("请输入姓名：");
        String name = sc.next();
        mobileCard.setUserName(name);       //  将输入的姓名传给setUserName
        System.out.print("请输入密码：");
        String mima = sc.next();
        mobileCard.setPassWord(mima);
        System.out.print("请输入预存花费金额：");
        double money = sc.nextInt();
        while (money<mobileCard.getServicePackage().getPrice()){       //  判断预存金额是否足够支付套餐
            System.out.print("你预存的花费不足以支付本月固定套餐资费，请重新充值：");
             money = sc.nextInt();
        }
        mobileCard.setSumprice(money);       //  将充值花费传给setSumprice
        double balance = money - mobileCard.getServicePackage().getPrice();   //  计算余额
        mobileCard.setMoney(balance);
        System.out.println("注册成功！卡号："+ArrsPhone[num - 1]+"  用户名："+name+"  当前余额："+balance);
        mobileCard.getServicePackage().showInfo();

        cards.put(mobileCard.getCardNumber(), mobileCard);    // 存入以注册用户集合
    }



    //  产生随机数  返回号码
    public String creatNumber(){
        Random random = new Random();    //  Random类是java.util下得到随机数字的方法。
        String phone ;            //  保存电话号码
        int num ;                    //  保存随机数
        do{
            num = random.nextInt(100000000);
        }while (num <  10000000);
        phone = "139" + num ;
        return phone ;
    }

    //   9个随机号码放入数组里
    public String [] getNewNumber(int count){
        String a =  creatNumber();
        String [] ArrsPhone = new String[count];
        for (int i = 0; i < count; i++) {
            if (ArrsPhone[i] == null){
                ArrsPhone[i] = a ;
            }
        }
        return ArrsPhone ;
    }

    // 根据用户所选的序号选择对应的套餐
    public  ServicePackage creatPack(  int select){
        ServicePackage servicePackage = null ;
        switch (select){
            //   各种套餐资费及服务内容
            case 1 :
                servicePackage = new TalkPackage ( 58,500,30) ;
                break;
            case 2:
                servicePackage = new NetPackage (68,3*1024) ;
                break;
            case 3:
                servicePackage = new SuperPackage (78,200,50,1*1024) ;
                break;

        }
        return servicePackage ;
    }


   //  验证是否存在账号密码  phone 手机号    mima 密码
    public  boolean isExistCard(String phone ,String mima){
     boolean flag = false ;
     Set<String> phoneNumber = cards.keySet();    // 获取集合键
     for (String phonesNum:phoneNumber){
         if (phonesNum.equals(phone)  &&  cards.get(phonesNum).getPassWord().equals(mima)){
            flag=true;
            break;
         }
     }
     return flag;
    }


    //  查询账单   number 手机号
    public void showAmountDatall(String number){
        //   声明要查询的对象
        MobileCard mobileCard;
        StringBuffer stringBuffer = new StringBuffer();
        mobileCard = cards.get(number);
        stringBuffer.append("您的卡号是："+number+"当月账单：\n");
        stringBuffer.append("套餐资费："+ (mobileCard.getServicePackage().getPrice())+"元 \n");
        stringBuffer.append("合计："+(mobileCard.getServicePackage().getPrice() + mobileCard.getConsumAmount())+"元 \n");
        stringBuffer.append("账户余额："+(mobileCard.getMoney())+"元 \n");
        System.out.println(stringBuffer.toString());

    }


    // 初始化场景
    public void initSence(){
        Scene a = new Scene(0,"通话",99,"问客户要不要材料，通话90分钟");
        Scene b = new Scene(0,"通话",23,"问老板要工资，通话23分钟");
        Scene c = new Scene(0,"短信",5,"问问餐厅中午吃什么，发送短信5条");
        Scene d= new Scene(0,"短信",13,"上班摸鱼和同时聊天，发送短信13条");
        Scene e = new Scene(0,"上网",1024,"上班摸鱼刷剧，使用流量1024MB");
        Scene f = new Scene(0,"上网",2048,"下班和女朋友视频，使用流量2048MB");
        // 存入集合
        scene.put(a.getNum(),a);
        scene.put(b.getNum(),b);
        scene.put(c.getNum(),c);
        scene.put(d.getNum(),d);
        scene.put(e.getNum(),e);
        scene.put(f.getNum(),f);
    }
}
