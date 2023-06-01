package Day6_1.Lian1;

public class MobileCard {
    String cardNumber ;
    String userName ;
    String passWord ;
    double consumAmount ;
    int realTalkTime ;
    int realSMSCount ;
    int realFlow;

    public MobileCard(String cardNumber, String userName, String passWord, double consumAmount, int realTalkTime, int realSMSCount, int realFlow) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.consumAmount = consumAmount;
        this.realTalkTime = realTalkTime;
        this.realSMSCount = realSMSCount;
        this.realFlow = realFlow;
    }

    public void showMeg(){}
}
