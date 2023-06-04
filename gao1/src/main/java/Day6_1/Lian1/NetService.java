package Day6_1.Lian1;
//   上网接口
public interface  NetService {
    // count    使用的流量数
    // mobileCard    超出套餐余量的话，要扣除哪张卡余额的对象
    public abstract int  netplay(int count ,MobileCard mobileCard) throws Exception;
}
