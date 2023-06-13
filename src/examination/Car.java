package examination;

/*编写一个Car类，包含这样两个属性：当前速度speed（整型）及车主的姓名name（字符串型）包含一个show()方法可用来显示两个属性的值，
包含一个构造器可以初始化两个属性，在main方法中定义两个Car类型的对象c,d并调用各自的方法。
 */
public class Car {
    public int speed;
    public String name;
    Car(int _speed, String _name){
        this.speed = _speed;
        name = _name;    }
    public void show(){
        System.out.println("speed :" + speed);
        System.out.println("name :" + name);
    }
    public static void main(String [] args){
        Car c = new Car(1, "yanhan");
        Car d = new Car(3, "freezing");
        c.show();
        d.show();

    }

}
