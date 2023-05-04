package io;
import java.awt.*;
import java.io.*;
public class FileTest {
    public static void main(String [] args){
        File f = new File("file1.txt");
        if (f.exists()){
            f.delete();
            System.out.println("文件删除成功");
        }
        else{
            try{
                f.createNewFile();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("文件名字是:" + f.getName());
            System.out.println("文件路径是:" + f.getPath());
            System.out.println("文件的绝对路径是:" + f.getAbsolutePath());
            System.out.println(f.canRead() ? "文件可读" : "文件不可读");
            System.out.println(f.canWrite() ? "文件可写" : "文件不可写");
        }
    }
}
