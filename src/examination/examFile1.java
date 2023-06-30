package examination;
import java.io.*;
import java.util.*;
public class examFile1 {
    public static void main(String [] args) throws IOException{
        File f = new File("E:/sample.txt");
        if (!f.exists()) {
            System.out.println("File is not exits.");
            //使用System.exit(0) 表示正常退出程序，使用非零的退出状态码（如System.exit(1)）表示程序以异常或错误的方式退出。
            System.exit(1);
        }
        // 文件大小大于100000KB的文件数量计数
        int count = 0;
        Scanner r = new Scanner(f);
        //存储文件类型（key）和个数（value）
        HashMap<String, Integer> fileTypeNums = new HashMap<>();
        while (r.hasNext()){
            String date = r.next();
            String time = r.next();
            int size = r.nextInt();
            String name = r.next();
            if (size > 100000){
                count ++;
            }
            //点在正则表达式中是一个特殊字符，表示匹配任意字符。因此，在使用 split() 方法时，需要对点进行转义，即使用 \\. 来表示匹配真正的点字符。
            String file_type= name.split("\\.")[1];
            if(fileTypeNums.containsKey(file_type)){
                fileTypeNums.put(file_type, fileTypeNums.get(file_type) + 1);
            }
            else {
                fileTypeNums.put(file_type, 1);
            }
        }
        //输出文件类型及个数
        Set<String> keys = fileTypeNums.keySet();
        for (Object key : keys) {
            System.out.println(key + "类型的文件共有" + fileTypeNums.get(key) + "个");
        }
        //输出文件大小大于100000kb的个数
        System.out.println("文件大小大于100000kb的个数为：" + count);
    }
}
