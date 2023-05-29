package Object_oriented1;
public class Circle {
    private static double PI=3.14;
    private double radius;
    public Circle(double r) {
        radius=r;
    }
    public static double average(Circle c[]) {
        //用来返回Circle对象数组里所有radius成员的平均值。
        double sum=0.0;
        for(int i=0;i<c.length;i++)
            sum+=c[i].radius;
        return (sum/c.length);
    }
}

