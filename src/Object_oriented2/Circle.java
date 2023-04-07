package Object_oriented2;

public class Circle extends Shape{
    double r;
    final double PI = 3.1415;
    public Circle(double r){
        this.r = r;
    }
    public Circle(){};
    public double getGirth(){
        girth = 2 * PI * r;
        return girth;
    }
    public double getArea(){
        area = PI * r * r;
        return area;
    }

}
