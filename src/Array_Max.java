import java.util.*;
public class Array_Max{
    public static void main(String[] args)  {
        //求N个数的最大数
        final int N=5;
        int score[]=new int[N];
        int max;

        Scanner reader=new Scanner(System.in);
        System.out.println("Input "+N+" number ,Please:");
        for(int i=0;i<N;i++)
            score[i]=reader.nextInt();
        max=score[0];
        for(int i=1;i<score.length;i++)
            if(score[i]>max) max=score[i];
        System.out.println("max="+max);
    }
}