package examination;

import java.util.Random;

public class MatrixText {
    private int[][] matrix;
    private int maxNum, maxRow, maxCol;

    public MatrixText() {
        matrix = new int[10][10];
        initMatrix();
        maxNum = -1;
        maxRow = -1;
        maxCol = -1;
    }

    // 初始化二维数组
    private void initMatrix() {
        Random random = new Random();//创建一个 Random 类型的对象实例的语句
        boolean[] used = new boolean[100]; // 记录数字是否已使用
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int num;
                do {
                    num = random.nextInt(100);
                } while (used[num]); // 避免数字重复
                used[num] = true;
                matrix[i][j] = num;
            }
        }
    }

    // 按行列输出数组中的数据
    public void printMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 输出数组中的最大数及其行号列号
    public void findMaxNum() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] > maxNum) {
                    maxNum = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("最大数是 " + maxNum + "，行号为 " + maxRow + "，列号为 " + maxCol);
    }
    public static void main(String[] args) {
        MatrixText matrix = new MatrixText();
        matrix.printMatrix();
        matrix.findMaxNum();
    }
}