package examination;

import java.util.Scanner;

public class inputArray {
    public static void main(String [] args){
        int[][] array = new int[3][4];
        System.out.println("请输入3*4维数组中的元素，空格或回撤分割");
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++)
                array[i][j] = reader.nextInt();
        }
        int max = array[0][0];
        int max_row = 0;
        int max_col = 0;
        System.out.println("数组中的元素是");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    max_row = i;
                    max_col = j;
                }
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
        System.out.println("max:" + max + "  max_row:" + max_row + "  max_col:" + max_col);
    }
}
