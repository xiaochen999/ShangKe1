package Day6_1.Lian1;

   //    移动卡类
public class MobileCard {
   private String cardNumber ;      // 卡号
    private String userName ;        //用户名
    private String passWord ;        //密码

    private ServicePackage servicePackage ; //所选卡类型
    private double consumAmount ;    //消费金额
    private double money ;        // 账户余额
    private int realTalkTime ;       // 实际通话时间
    private int realSMSCount ;       //实际短信条数
    private int realFlow;            //实际流量

    private double sumprice;     // 预存金额

       public MobileCard() {
       }

       public double getSumprice() {
           return sumprice;
       }

       public double getMoney() {
           return money;
       }

       public void setMoney(double money) {
           this.money = money;
       }

       public void setSumprice(double sumprice) {
           this.sumprice = sumprice;
       }

       public MobileCard(String cardNumber, String userName, String passWord, ServicePackage servicePackage, double consumAmount, int realTalkTime, int realSMSCount, int realFlow) {
           this.cardNumber = cardNumber;
           this.userName = userName;
           this.passWord = passWord;
           this.servicePackage = servicePackage;
           this.consumAmount = consumAmount;
           this.realTalkTime = realTalkTime;
           this.realSMSCount = realSMSCount;
           this.realFlow = realFlow;
       }

       public String getCardNumber() {
           return cardNumber;
       }

       public void setCardNumber(String cardNumber) {
           this.cardNumber = cardNumber;
       }

       public String getUserName() {
           return userName;
       }

       public void setUserName(String userName) {
           this.userName = userName;
       }

       public String getPassWord() {
           return passWord;
       }

       public void setPassWord(String passWord) {
           this.passWord = passWord;
       }

       public ServicePackage getServicePackage() {
           return servicePackage;
       }

       public void setServicePackage(ServicePackage servicePackage) {
           this.servicePackage = servicePackage;
       }

       public double getConsumAmount() {
           return consumAmount;
       }

       public void setConsumAmount(double consumAmount) {
           this.consumAmount = consumAmount;
       }

       public int getRealTalkTime() {
           return realTalkTime;
       }

       public void setRealTalkTime(int realTalkTime) {
           this.realTalkTime = realTalkTime;
       }

       public int getRealSMSCount() {
           return realSMSCount;
       }

       public void setRealSMSCount(int realSMSCount) {
           this.realSMSCount = realSMSCount;
       }

       public int getRealFlow() {
           return realFlow;
       }

       public void setRealFlow(int realFlow) {
           this.realFlow = realFlow;
       }


       public void showMeg(){
       }
}
