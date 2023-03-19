package shuzu;

public class ArrayCopyTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int aa[] = new int[] { 1, 2, 3, 4, 5 };
        int bb[] = new int[] { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        System.arraycopy(aa, 0, bb, 0, 5);

        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < bb.length; j++) {
            System.out.print(bb[j] + " ");
        }
        System.out.println();
    }

}
