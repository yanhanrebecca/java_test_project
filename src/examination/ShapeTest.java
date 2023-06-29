package examination;

abstract class Shape {
    protected double area;  // 面积
    protected double perimeter;  // 周长

    public abstract double getArea();  // 求面积的方法
    public abstract double getPerimeter();  // 求周长的方法
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (width + height);
        return perimeter;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}

public class ShapeTest {
    public static double getAllarea(Shape[] shapes){
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++){
            totalPerimeter += shapes[i].getPerimeter();
        }
        return totalPerimeter;
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[8];
        shapes[0] = new Rectangle(2.0, 3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Rectangle(1.5, 2.5);
        shapes[3] = new Square(2.0);
        shapes[4] = new Square(3.0);
        shapes[5] = new Circle(2.0);
        shapes[6] = new Circle(3.0);
        shapes[7] = new Circle(4.0);

        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++){
            totalPerimeter += shapes[i].getPerimeter();
        }

        System.out.println("各种形的周长之和为：" + totalPerimeter);

        System.out.println("hanshu1:" + getAllarea(shapes));
    }
}
