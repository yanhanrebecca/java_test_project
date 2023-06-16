package examination;

public class Circle {
    private double radius;
    private static int count = 0;

    public Circle() {
        radius = 1.0;
        count++;
    }

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount() {
        return count;
    }
    public static void main(String [] args){
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.setRadius(23);
        System.out.println(c1.getRadius());
        System.out.println(c1.getPerimeter());

    }
}
