package Day6_1;

import java.util.ArrayList;
import java.util.Collection;


import static javafx.beans.binding.Bindings.isEmpty;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList coll = new ArrayList();
        coll.add(1212);
        coll.add(11111);
        coll.add("asdsada");
        coll.add("啊啊啊啊");
        coll.add(11111);
        coll.add(222222);
        coll.add(7777777);
        coll.add("CCCCCCCCC");
        coll.add(11111);
        coll.add(true);
        Collection coll2= new ArrayList();
        coll2.add("aa");
        System.out.println(coll);
        System.out.println("-------------");
        System.out.println(coll2);
        System.out.println("**************");
        //addAll()    将集合coll2添加到coll中
        coll.addAll(coll2);
        System.out.println(coll);
        //size()   查看数据的长度【个数】
        System.out.println(coll.size());
        //equals()  比较2个对象【集合】是否相等
        System.out.println(coll.equals(coll2));
        System.out.println("//////////////////////");
        // isEmpty()   判断是否为空
        System.out.println(coll2.isEmpty());
        //  remove() 从集合中移除某个对象
        coll.remove("啊啊啊啊");
        System.out.println(coll);
        //  contains()  是否包含某个对象
        System.out.println(coll.contains(1212));
        System.out.println(".........................");
        //  set(int index,object o)  将对象加入到指定位置
        coll.set(1,true);
        System.out.println(coll);
        //   get() 获取指定位置的数据
        System.out.println(coll.get(5));
        //  indexOf(object o) 返回集合中第一个索引位置
        System.out.println(coll.indexOf(11111));
        //   lastindexOf(object o) 返回集合中最后一个索引位置
        System.out.println(coll.lastIndexOf(11111));
    }


}
