package finally_exam_practice;
import java.util.*;
public class MatrixText {
    int [][] maxtrix;
    public MatrixText(){
        maxtrix = new int[10][10];
        Random random = new Random();
        int[] used = new int[100];
        for (int i = 0; i < 10; i++){
            used[i] = 0;
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                int num = 0;
                do {
                    num = random.nextInt(100);
                } while (used[num] == 1);
                maxtrix[i][j] = num;
                used[num] = 1;
            }
        }
    }
    public void printMaxtrix(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                System.out.print("\t" + maxtrix[i][j]);
            }
            System.out.println();
        }
    }
    public void findMax(){
        int max = maxtrix[0][0], max_row = 0, max_col = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                if(maxtrix[i][j] > max){
                    max = maxtrix[i][j];
                    max_row = i;
                    max_col = j;
                }
            }
            System.out.println();
        }
        System.out.println("max:" + max);
        System.out.println("max_row:" + max_row);
        System.out.println("max_col:" + max_col);
    }
    public static void main(String [] args){
        MatrixText maxtrix = new MatrixText();
        maxtrix.printMaxtrix();
        maxtrix.findMax();
    }
}
