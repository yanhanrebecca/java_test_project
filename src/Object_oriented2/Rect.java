package Object_oriented2;

public class Rect implements Shape{
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
        return (width + height) * 2;
    }
    public  double getArea(){
        return width * height;
    }
}
