package Object_oriented2;
public class MethodAdd {//方法重载
    static int add(int x,int y){//计算两个整数的和
        int sum;
        sum = x+y;
        return sum;
    }
    static double add(double x,int y){
        double sum;
        sum = x+y;
        System.out.println("dsadsaSDA");
        return sum;
    }
    static int add(int x,int y,int z){
        //计算三个整数的和
        return x+y+z;
    }
    static double add(double x,double y){
        //计算两个双精度浮点数的和
        return x+y;
    }
    public static void main(String args[]){
        int sum1;
        sum1 = add(135,246);
        System.out.println(sum1);
        System.out.println(add(123,456,789));
        double sum3;
        sum3 = add(1.2,4);
        System.out.println(sum3);
    }
}

