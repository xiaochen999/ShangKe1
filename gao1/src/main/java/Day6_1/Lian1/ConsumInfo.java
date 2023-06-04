package Day6_1.Lian1;
 //   消费信息类
public class ConsumInfo {
   private   int talkTime ;     //通话时间
   private int smsCount ;    // 短信条数
   private int flow ;        // 上网流量
   private double price ;      // 资费

    public ConsumInfo() {
    }

    public ConsumInfo(int talkTime, int smsCount, int flow, double price) {
        this.talkTime = talkTime;
        this.smsCount = smsCount;
        this.flow = flow;
        this.price = price;
    }

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

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
