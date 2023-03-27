public class Water_flower {
    static boolean sxh(int n){
	   /*n是三位整数，判断n是否为水仙花数，如果是返回true，否则返回false
	     水仙花数等于其个位数的立方加十位数的立方加百位数的立方。
	     例如，153=1的立方+5的立方+3的立方，所以153是水仙花数 */
        String n_str =Integer.toString(n);
        int sum = 0;
        int j = 0;
        for(int i = 0; i < 3; i++){
            //将j转换成整形
            j = n_str.charAt(i) - '0';
            sum += j * j * j;
        }
        if (sum == n){
            return true;
        }
        return false;
    }
    static void printsxh(){
        //输出100到999之间的所有水仙花数
        for(int i = 100; i < 1000; i++){
            if(sxh(i)){
                System.out.print(i + ",");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("100到999之间的所有水仙花数:");
        printsxh();  //调用方法输出100-999的水仙花数
    }
}
