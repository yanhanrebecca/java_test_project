package Object_oriented2;

public class TestShape {
    public static void main(String[] args){
        Shape[] sp = new Shape[3];
        sp[0] = new Rect(34.2, 45);
        sp[1] = new Square(33);
        sp[2] = new Circle(2.5);
        System.out.println("矩形周长：" + sp[0].getGirth() + ", 面积：" + sp[0].getArea());
        System.out.println("正方形周长：" + sp[1].getGirth() + ", 面积：" + sp[1].getArea());
        System.out.println("圆形周长：" + sp[2].getGirth() + ", 面积：" + sp[2].getArea());

    }
}
