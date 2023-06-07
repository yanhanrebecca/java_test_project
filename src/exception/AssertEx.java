package exception;
import java.util.Scanner;
public class AssertEx {
    public static void main(String[] args) {
        //默认的运行方式是关闭断言语句的
        int a[]=new int[5];
        int sum=0;
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
            a[i]=r.nextInt();
            assert a[i]>=0:"负数不能为成绩。";  //条件为真程序执行
            sum+=a[i];
        }
        r.close();
        System.out.println("总成绩为:"+sum);
    }
}
//断言语句在调试代码阶段有时非常有用，一般用于程序不准备通过捕获异常来处理错误。
//java -ea exception.AssertEx

