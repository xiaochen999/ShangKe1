package Day6_1.Lian1;

//  短信接口
public interface SendService {

    // count 发送短信的条数
    // mobileCard    超出套餐余量的话，要扣除哪张卡余额的对象
    public abstract int  send(int count ,MobileCard mobileCard) throws Exception;
}
