//D:\\sample2023.txt    （每行代表一个文件，可能有很多行，大家统计文件类型个数，并把统计得到的文件类型输出出来）
//        5月25日上交纸质版，写上学号姓名。
//
//        2018/10/12  17:11           189,137    20181005-01_页面_1.jpg
//        2018/10/10  16:19           137,564 20181005-01.pdf
//        2018/10/12  17:11           189,124    20181005-01_页面_2.jpg
//        2013/04/23  09:25           1,940,285  00-12.pdf
//        2018/10/12  15:49            12,022 wwww.docx
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class file_homework {
    public static void main(String [] args) throws IOException {
        FileReader file = new FileReader("sample2023.txt");
        // 使用ArrayList来存储每行读取到的字符串
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(file);
        HashMap<String,Integer> result = new HashMap<>();
        String str;
        while ((str = bf.readLine()) != null) {
            arrayList.add(str);
        }
        bf.close();
        file.close();
        for(int i = 0; i < arrayList.toArray().length; i++){
            String str_2 = arrayList.get(i);
            char[] str_arr = str_2.toCharArray();
            for(int j = 0; j < str_arr.length; j++){
                if(arrayList.get(i).toCharArray()[j] == '.'){
                    String file_type_string = str_2.substring(j + 1, str_arr.length);
                    if(result.containsKey(file_type_string)){
                        //出现过，先得到集合中的出现次数再自加
                        Integer count = result.get(file_type_string);
                        count++;
                        result.put(file_type_string, count);
                    }else {
                        //没出现直接放进集合中
                        result.put(file_type_string, 1);
                    }
                }

            }
        }
    System.out.println(result);
    }
}
