package Object_oriented1;
public class Circle_test {
    public static void main(String args[])
    {
        Circle cir[]=new Circle[3];
        cir[0]=new  Circle(1.0);
        cir[1]=new  Circle(4.0);
        cir[2]=new  Circle(2.0);
        System.out.println("radius??????????  "+Circle.average(cir));
        //System.out.println("???PI????  "+Circle.?);PI是private不可以输出，改成public才可以输出
    }
}