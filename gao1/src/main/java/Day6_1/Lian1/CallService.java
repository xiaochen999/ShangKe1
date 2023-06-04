package Day6_1.Lian1;
//    电话接口
public interface CallService {
    // count    使用的通话时长
    // mobileCard    超出套餐余量的话，要扣除哪张卡余额的对象
    public abstract int  call(int count ,MobileCard mobileCard) throws Exception;
}
