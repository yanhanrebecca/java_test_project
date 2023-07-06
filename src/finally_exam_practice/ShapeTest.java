package finally_exam_practice;
abstract class Shape{
    public double area;
    public double perimeter;

    public abstract double getArea();
    public abstract double getPerimeter();
}
class circle extends Shape{
    public double r;
    public circle(double r){
        this.r = r;
    }
    public double getArea(){
        double area = Math.PI * r * r;
        return area;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * r;
    }
}
class rectangle extends Shape{
    public double a;
    public double b;
    public rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        double area = a * b;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
class square extends Shape{
    public double a;
    public square(double a){
        this.a = a;
    }
    public double getArea(){
        double area = a * a;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 4 * a ;
    }
}
public class ShapeTest {
    public static double getAllperimeter(Shape[] shapes){
        double perimeter = 0;
        for(int i = 0; i < shapes.length; i++){
            perimeter += shapes[i].getPerimeter();
        }
        return perimeter;
    }
    public static void main(String [] args){
        Shape[] shapes= new Shape[8];
        shapes[0] = new circle(1);
        shapes[1] = new circle(1);
        shapes[2] = new circle(1);
        shapes[3] = new rectangle(1, 1);
        shapes[4] = new rectangle(1, 1);
        shapes[5] = new rectangle(1, 1);
        shapes[6] = new square(1);
        shapes[7] = new square(1);
        double result = getAllperimeter(shapes);
        System.out.println(result);

    }

}
