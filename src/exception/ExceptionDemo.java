package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
class MyException extends Exception{//创建自己的异常类，必须继承Exception
    private String message;
    public MyException(String ErrorMessage){
        message = ErrorMessage;
    }
    public String getMessage(){
        return message;
    }

}

public class ExceptionDemo {
    static int quotient(int x, int y) throws MyException{//自定义方法抛出异常
        if (y < 0)
            throw  new MyException("除数不能是负数");
        else if (y == 0)
            throw new MyException("除数不能是0");
        return x/y;
    }
    public static void main(String [] args){
        int m, n;
        System.out.println("输入两个数m,n:");
        Scanner r = new Scanner(System.in);
        try{
            m = r.nextInt();
            n = r.nextInt();
            int result  = quotient(m, n);
            System.out.println(m + " / " + n + " = " + result);
        } catch(InputMismatchException e){
            System.out.println("输入数据不合理！");
        }
        catch (MyException e){//处理自定义异常
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("程序发生了其他异常");
        }
        finally {
            r.close();
        }

    }
}
