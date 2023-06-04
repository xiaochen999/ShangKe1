package Day6_2;

import java.io.*;

public class TestFileCopy {


    public static void main(String[] args) {
        try {
            long st = System.currentTimeMillis();
            TestFileCopy.Copy("C:\\Users\\86199\\Desktop\\上课\\JAVA\\AA.txt","C:\\Users\\86199\\Desktop\\上课\\JAVA\\BB.txt");
            long end = System.currentTimeMillis();
            System.out.println("响应时间："+(end-st));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public  static  void Copy(String src,String path) throws Exception {
        File f1= new File(src);
        File f2=new File(path);
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);


        byte[] buffer = new byte[30];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer,0,len);
        }
        fis.close();
        fos.close();

    }
}
