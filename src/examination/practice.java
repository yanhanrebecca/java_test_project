package examination;

import java.util.Random;

public class practice {
    int scores[] = {24, 35, 88, 76, 90, 54, 59, 66, 99};
    public int getUp(int[] up) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int aver = sum / scores.length;
        int j = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > aver) {
                up[j] = scores[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String [] args){
        practice s = new practice();
        int[] up = new int[100];
        int result = s.getUp(up);
        System.out.println("人数：" + result);
        for(int i = 0; i < result; i++){
            System.out.print("\t" + up[i]);
        }
    }
}
    

