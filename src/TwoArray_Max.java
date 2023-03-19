import java.util.*;
public class TwoArray_Max{
    public static void main(String[] args)  {
        /*通过键盘给3*4的二维数组输入数据,
         *然后按行输出数组元素,
         *并输出数组中最大的元素及行和列号
         **/
        final int N=3,M=4;
        int a[][]=new int[N][M];
        Scanner reader=new Scanner(System.in);
        System.out.println("Input "+N+"*"+M+" number ,Please:");
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                a[i][j]=reader.nextInt();
        System.out.println("数组中元素是");
        int max,row,col;
        max=a[0][0];
        row=col=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("%5d",a[i][j]);
                if(a[i][j]>max){max=a[i][j];row=i;col=j;}
            }
            System.out.println();
        }
        System.out.println("row="+row+"  col="+col+"  max="+max);
    }
}