package Object_oriented2;

public class Circle implements Shape{
    double r;
    final double PI = 3.1415;
    public Circle(double r){
        this.r = r;
    }
    public Circle(){};
    public double getGirth(){
        return 2 * PI * r;
    }
    public double getArea(){
        return PI * r * r;
    }

}
