package examination;
import java.io.*;
import java.net.FileNameMap;
import java.util.*;
public class examFile2 {
    public static void main(String [] args) throws IOException{
        File f = new File("sample.txt");
        if(!f.exists()){
            System.out.println(f + "文件不存在！！");
            System.exit(1);
        }
        Scanner r = new Scanner(f);
        //jpg_sum_size是jpg文件大小的总和, jpg_count是jpg类型文件的数量
        int jpg_sum_size = 0, jpg_count = 0;
        while(r.hasNext()){
            String date = r.next();
            String time = r.next();
            double size = r.nextDouble();
            String name = r.next();
            String file_type = name.split("\\.")[1];
            if (file_type.equals("jpg")){
                jpg_count++;
                jpg_sum_size += size;
            }
        }
        System.out.println("jpg类型文件的数量:" + jpg_count);
        System.out.println("jpg文件大小的总和是：" + jpg_sum_size/1024 + "MB");
    }
}
