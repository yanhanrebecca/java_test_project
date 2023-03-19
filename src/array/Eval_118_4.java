package array;
public class Eval_118_4 { // 创建类
    public static void change(int[][] a){
        //将数组本身的数据行列互换
        int i,j,temp;
        for(i=1;i<a.length;i++) //对矩阵a的下三角循环
            for(j=0;j<i;j++){//将a[i][j]和a[j][i]交换
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
    }
    public static void showArray(int[][] arr){
        //将数组的数据按行显示
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("数组原有内容：");
        showArray(arr);
        change(arr);//将数组arr的数据行列互换
        System.out.println("行列互换后数组内容：");
        showArray(arr);
    }
}

