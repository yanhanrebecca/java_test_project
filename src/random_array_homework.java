/*
截止日期:3月30日
作业要求：使用模块化设计的思想，设计一个类，能够通过成员函数生成[60-100）之间的20个不重复的随机整数（存放在数组中），
也可以调用函数输出数组中的数据，每5个一换行，每个整数占屏幕5个宽度。该类中要包含main()方法对类中的函数进行测
试。收纸质版，可以正反面书写，写好学号和姓名。
 */
public class random_array_homework {
    public static int[] create_no_repeat_random_int(int len) {
        //生成[60-100）之间的len个不重复的随机整数,返回一个数组
        int random_arr[]=new int[len];
        for(int i = 0; i < random_arr.length; i++) {
            boolean have_same_in_array = false;
            int s = 60 + (int) (Math.random() * (100 - 60));
            if (i == 0){
                random_arr[i] = s;
                continue;
            }
            if (i > 0) {
                for(int j = 0; j < i; j++){
                    //去重：如果数组中已有相同整数，i回退，进行下次循环
                    if(i != j && random_arr[j] == s){
                        i -= 1;
                        have_same_in_array = true;
                    }
                }
                if (!have_same_in_array){
                    random_arr[i] = s;
                }
            }
        }
        return random_arr;
    }
    public static void show_array(int[] array) {
        //输出数组中的数据，每5个一换行，每个整数占屏幕5个宽度
        for(int i = 0; i < array.length; i++){
            System.out.printf("%5d", array[i]);
            if (i % 5 == 4)
                System.out.println();
        }
    }
    public static void main(String[] args) {
        // 调用产生20个不重复随机数组方法
        int random_list[]=create_no_repeat_random_int(20);
        //测试create_no_repeat_random_int
        System.out.print("函数生成的数组是：");
        for (int i = 0; i < random_list.length; i++) {
            System.out.print(random_list[i]+",");
        }
        System.out.println("\n");
        //测试show_array
        System.out.println("数组每5个整数一换行,输出结果是:");
        show_array(random_list);

    }

}
