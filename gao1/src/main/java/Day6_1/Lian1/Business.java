package Day6_1.Lian1;

import java.util.Scanner;

public class Business {
    Scanner sc = new Scanner(System.in);
    CardUilt cardUilt = new CardUilt();
    String phoneNumber;    //  手机号
    String passWord;      // 密码

    //   一级菜单
    public void startOne(){

        boolean  boo = true;
        do {
            System.out.println("**************欢迎使用嗖嗖移动业务大厅***********");
            System.out.println("1.用户登录  2.用户注册  3.使用嗖嗖  4.话费充值  5.资费说明  6.退出系统");
            System.out.print("请选择选择");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("请输入电话号码：");
                    phoneNumber = sc.next();
                    System.out.print("请输入密码：");
                    passWord = sc.next();
                    boolean flag = cardUilt.isExistCard(phoneNumber,passWord);
                    if (flag){
                        startTwo();
                    }else {
                        System.out.println("手机号或者密码错误");
                    }

                    break;
                case 2:
                    MobileCard mobileCard = new MobileCard();
                    cardUilt.addCard(mobileCard);
                    break;
                case 3:
                    System.out.println("使用嗖嗖");
                    break;
                case 4:
                    System.out.println("话费充值");
                    break;
                case 5:
                    System.out.println("资费说明");
                    break;
                case 6:
                    System.out.println("退出系统");
                    System.out.println("谢谢使用");
                    boo = false ;

                default:
                    System.out.println("输入错误，重新开始");
                    break;
            }
            System.out.print("输入0返回：");
            num = sc.nextInt();
        } while (boo);

    }

     //   二级菜单
    public void startTwo(){
        System.out.println("**********嗖嗖移动用户菜单**********");
        System.out.println("1.本月账单查询");
        System.out.println("2.套餐剩余量查询");
        System.out.println("3.打印消费详单");
        System.out.println("4.套餐变更");
        System.out.println("5.办理退网");
        System.out.println("请选择（输入1-5选择功能，其他返回上一级）：");
        int num2 = sc.nextInt();
        boolean  boo2 = true;
        do {
            switch (num2){
                case 1:
                    cardUilt.showAmountDatall(phoneNumber);
                    return;
                case 2:
                    System.out.println("2.套餐剩余量查询");
                    return;
                case 3:
                    System.out.println("3.打印消费详单");
                    return;
                case 4:
                    System.out.println("4.套餐变更");
                    return;
                case 5:
                    System.out.println("5.办理退网");
                    return;
                default:
                    startOne();
                    boo2 = false ;
            }
        } while (boo2);



    }
}
