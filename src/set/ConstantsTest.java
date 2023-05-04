package set;
interface Constants{
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}
public class ConstantsTest {
    enum Constants2{
        Constants_A, Constants_B;
        //monday, tuesday
    }
    public static void doit(int c){//int 类型参数
        switch (c){
            case Constants.Constants_A:
                System.out.println("doit() Constants_A");
                break;
            case Constants.Constants_B:
                System.out.println("doit() Constants_B");
                break;
        }
    }
    public static void doit2(Constants2 c){//枚举类型参数
        switch (c){
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }
    }
    public static void main(String [] args){
        ConstantsTest.doit(Constants.Constants_A);
        //使用枚举类型中的常量
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(1);
        //ConstantsTest.doit2(1);

    }
}
