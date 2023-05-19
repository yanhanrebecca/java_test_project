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
