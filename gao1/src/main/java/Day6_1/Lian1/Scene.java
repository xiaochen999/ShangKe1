package Day6_1.Lian1;
// 场景类

public class Scene {

    private  int num ;   // 场景的序号
    private String type ;   // 场景类型
    private int data ;     // 场景消费的数据
    private String description ;    // 场景描述


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Scene (){}

    public Scene(int num, String type, int data, String description) {
        this.num = num;
        this.type = type;
        this.data = data;
        this.description = description;
    }
}
