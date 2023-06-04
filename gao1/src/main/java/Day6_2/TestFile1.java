package Day6_2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
    public static void main(String[] args) {
        File f1 = new File("T/H");
        File f2 = new File("C:\\Users\\86199\\Desktop\\上课\\JAVA\\AA.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.getParent());
        System.out.println(f1.length());
        System.out.println(f1.lastModified());
        System.out.println("*****************************");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.getName());
        System.out.println(f2.getParent());
        System.out.println(f2.length());
        System.out.println(f2.lastModified());
        System.out.println("++++++++++++++++++++++++++++++++++");

        if(f1.exists()){
            f1.delete();
            System.out.println("删除文件成功...");
        }else{
            try {
                f1.createNewFile();
                System.out.println("文件创建成功....");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
