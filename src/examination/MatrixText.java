package examination;

import java.util.Random;

public class MatrixText {
    private int[][] arr = new int[10][10];
    private Random random = new Random();

    public MatrixText() {
        while (true) {
            if (generateArray()) {
                printMatrix();
                getMax();
                break;
            }
        }
    }

    private boolean generateArray() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int n = getInt();
                if (n == -1)
                    return false;
                arr[i][j] = n;
            }
        }
        return true;
    }

    private int getInt() {
        int n;
        do {
            n = random.nextInt();
            //System.out.println(n);
        } while (exist(n));
        return n;
    }

    private boolean exist(int n) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == n)
                    return true;
            }
        }
        return false;
    }

    public void printMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void getMax() {
        int max = 0;
        int i = 0;
        int j = 0;

        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (arr[m][n] > max) {
                    max = arr[m][n];
                    i = m;
                    j = n;
                }
            }
        }

        System.out.println("最大数:" + max);
        System.out.println("行号:" + i);
        System.out.println("列号:" + j);
    }
    public static void main(String[] args) {
        MatrixText mt = new MatrixText();
    }
}