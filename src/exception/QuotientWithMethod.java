package exception;
import java.util.Scanner;

public class QuotientWithMethod {
    public static int quotient(int n1, int n2){
        if (n2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return n1/n2;
    }
    public static void main(String[] args){
        Scanner r = new Scanner((System.in));
        System.out.println("Enter two Integers:");
        int n1 = r.nextInt();
        int n2 = r.nextInt();
        r.close();
        try {
            int result = quotient(n1, n2);
            System.out.println(n1 + " / " + n2 + " is " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Execution an integer " + e.getMessage());
        }
        System.out.println("Execution continues...");
    }
}
