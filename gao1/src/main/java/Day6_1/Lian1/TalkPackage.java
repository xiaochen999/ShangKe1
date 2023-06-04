package Day6_1.Lian1;
//   话痨套餐
public class TalkPackage extends ServicePackage implements CallService,SendService{
   private int talkTime ;    //  通话时长
   private int smsCount ;    //   发送短信条数


    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }
    public TalkPackage () {}

    public TalkPackage(int talkTime, int smsCount) {
        this.talkTime = talkTime;
        this.smsCount = smsCount;
    }

    public TalkPackage(double price, int talkTime, int smsCount) {
        super(price);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
    }

    public void showInfo() {
        System.out.println("话痨套餐：通话时长为："+this.getTalkTime()+"分钟/月，短信条数为："+this.getSmsCount()+"条/月");
    }


    // 通话功能    count 通话时间    mobileCard超出套餐余量的话，要扣除哪张卡余额的对象
    public int call(int count ,MobileCard mobileCard) throws Exception {
        int temp =  count ;
        for (int i = 0; i < count; i++) {
            if (this.getTalkTime()-mobileCard.getRealTalkTime() >=1){  //  套餐中的通话时长 - 实际的通话时长   说明还有余额
                mobileCard.setRealTalkTime(getTalkTime() + 1 );

            }else if (mobileCard.getMoney() >=0.2){   //  说明我的余额还够，也说明我的套餐通话余量超量了
                mobileCard.setMoney(mobileCard.getMoney() - 0.1);
                mobileCard.setRealTalkTime(mobileCard.getRealTalkTime() +1);
                mobileCard.setConsumAmount(mobileCard.getConsumAmount() + 0.1);
            }else {     // 说明我超额了，同时也没话费了
                throw new Exception("本次通话"+ i + "分钟，余额已不足，请充值");
            }
        }


        return temp;
    }

    //   发送短信功能
    public int send(int count ,MobileCard mobileCard) throws Exception {
        int temp =  count ;
        for (int i = 0; i < count; i++) {
            if (this.getSmsCount()-mobileCard.getRealSMSCount() >=1){  //  套餐中的通话时长 - 实际的通话时长   说明还有余额
                mobileCard.setRealSMSCount(getTalkTime() + 1 );

            }else if (mobileCard.getMoney() >=0.1){   //  说明我的余额还够，也说明我的套餐短信余量超量了
                mobileCard.setMoney(mobileCard.getMoney() - 0.1);
                mobileCard.setRealTalkTime(getTalkTime() +1);
                mobileCard.setConsumAmount(mobileCard.getConsumAmount() + 0.1 );
            }else {     // 说明我超额了，同时也没话费了
                throw new Exception("本次发送短信"+ i + "条 ，余额已不足，请充值");
            }
        }


        return temp;
    }

}
