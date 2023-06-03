package zhujie;
import java.lang.reflect.*;
public class Main_o2 {
    public static void main(String [] args){
        Example_02 example = new Example_02();
        Class exampleC = example.getClass();
        //获得所有成员变量
        Field[] declaredFields = exampleC.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++){
            Field field = declaredFields[i];//遍历成员变量
            System.out.println("名称为：" + field.getName());
            Class fieldType = field.getType(); //获得成员变量类型
            System.out.println("类型为：" + fieldType);
        }
    }
}

