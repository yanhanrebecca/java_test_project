package Object_oriented1;

public class value_test {
    public static void main(String [] args){
        int b = 10;
        System.out.println("传值调用传值调用HalfInt之前b="+b);
        halfint(b);
        System.out.println("传值调用HalfInt之后b="+b);
    }
    public static void halfint(int a){
        a /= 2;
    }
}
