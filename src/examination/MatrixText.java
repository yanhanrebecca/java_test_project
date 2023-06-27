package examination;

import java.util.Random;

public class MatrixText {
    private int[][] matrix;

    public MatrixText() {
        matrix = new int[10][10];
        Random random = new Random();
        int[] used = new int[100];
        for(int i =0; i < 100; i++){
            used[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int num;
                do {
                    num = random.nextInt(100);
                } while (used[num] == 1);
                matrix[i][j] = num;
                used[num] = 1;
            }
        }
    }
    public void printMatrixText(){
        System.out.println("二维数组是：");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("\t" + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void findMaxNum(){
        int maxNum = matrix[0][0], max_col = 0, max_row = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matrix[i][j] > maxNum){
                    maxNum = matrix[i][j];
                    max_row = i + 1;
                    max_col = j + 1;
                }
            }
        }
        System.out.println("最大数是" + maxNum);
        System.out.println("行号是" + max_row);
        System.out.println("列号是" + max_col);
    }
    public static void main(String [] args){
        MatrixText mat = new MatrixText();
        mat.printMatrixText();
        mat.findMaxNum();
    }
}


