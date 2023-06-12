import java.util.Arrays;
import java.util.Comparator;
public class Array_sort {
    Point[] arr;
    Array_sort(){
        arr = new Point[4];
        for(int i = 0; i < arr.length; i++)
            arr[i] = new Point();
    }
    public static void main(String [] args){
        //初始化对象中的数据
        Array_sort sort = new Array_sort();
        sort.arr[0].x = 2; sort.arr[0].y = 1;
        sort.arr[1].x = 2; sort.arr[1].y = 2;
        sort.arr[2].x = 1; sort.arr[2].y = 2;
        sort.arr[3].x = 0; sort.arr[3].y = 2;
        Arrays.sort(sort.arr, new MyComprator());    //使用指定的排序器，进行排序
        for(int i=0;i<4;i++)    //输出排序结果
            System.out.println("("+sort.arr[i].x+","+sort.arr[i].y+")");
    }
}
class Point{
    int x;
    int y;
}
//比较器
class MyComprator implements Comparator{
    public int compare(Object arg0, Object arg1) {
        Point t1=(Point)arg0;
        Point t2=(Point)arg1;
        if(t1.x != t2.x)
            return t1.x>t2.x? 1:-1;
        else
            return t1.y>t2.y? 1:-1;
    }
}