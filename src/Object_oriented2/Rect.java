package Object_oriented2;

public class Rect extends Shape{
    //矩形
    double width;
    double height;
    public Rect(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rect(){}
    public double getGirth(){
        //方法覆盖overload，求矩形周长
        girth = (width + height) * 2;
        return girth;
    }
    public  double getArea(){
        area = width * height;
        return area;
    }
}
