package string;

public class IntegerTest {
    public static void main(String[] args){
        String str = Integer.toString(456);
        String str2 = Integer.toBinaryString(456);
        int i = Integer.parseInt("456");
        int maxint = Integer.MAX_VALUE;
        int intsize = Integer.SIZE;
        System.out.println("'456'的十进制表示为:" + str2);
        System.out.println("'456'的二进制表示为:" + str);
        System.out.println("\"456\"转换为十进制是：" + i);
        System.out.println("int类型的最大取值为:" + maxint);
        System.out.println("int类型的二进制位数为" + intsize);
    }
}
