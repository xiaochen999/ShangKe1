package Day6_1.Lian1;
    //   网虫套餐
public class NetPackage extends ServicePackage implements NetService{
     private int flow ;   // 流量

        public int getFlow() {
            return flow;
        }

        public void setFlow(int flow) {
            this.flow = flow;
        }

        public NetPackage () {}

        public NetPackage(int flow) {
            this.flow = flow;
        }

        public NetPackage(double price, int flow) {
            super(price);
            this.flow = flow;
        }

        @Override
        public void showInfo() {
            System.out.println("网虫套餐：上网流量为："+this.getFlow()+"MB/每月");
        }

        //   上网功能
        public int netplay(int count ,MobileCard mobileCard) throws Exception {
            int temp =  count ;
            for (int i = 0; i < count; i++) {
                if (this.getFlow()-mobileCard.getRealSMSCount() >=1){  //     说明还有余额
                    mobileCard.setRealSMSCount(mobileCard.getRealSMSCount() + 1 );

                }else if (mobileCard.getMoney() >=0.2){   //  说明我的余额还够，也说明我的套餐流量余量超量了
                    mobileCard.setMoney(mobileCard.getMoney() - 0.1);
                    mobileCard.setRealSMSCount(mobileCard.getRealSMSCount() +1);
                    mobileCard.setConsumAmount(mobileCard.getConsumAmount() + 0.1 );
                }else {     // 说明我超额了，同时也没话费了
                    throw new Exception("本次上网使用流量"+ i + "MB，余额已不足，请充值");
                }
            }


            return temp;
        }
    }
