package exception;
import java.util.Scanner;
public class QuotientWithMethod_1 {
    public static int quotient(int n1,int n2) {
        if(n2==0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter two Integers:");
        int n1=r.nextInt();
        int n2=r.nextInt();
        r.close();
        int result=quotient(n1,n2);
        System.out.println(n1+" / "+n2+" is "+result);
        System.out.println("Execution continues...");


    }
}
