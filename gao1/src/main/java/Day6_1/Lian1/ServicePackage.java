package Day6_1.Lian1;

//  套餐父类
public abstract class ServicePackage {
   private double price ;    //  套餐流量

    public ServicePackage() {
    }

    public ServicePackage(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  abstract void showInfo();
}
