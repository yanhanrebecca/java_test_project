/*
2023.3.30练习:
编写一个公有Car类，包含这样两个属性:当前速度 speed (整型)及车主的姓名name (字符串型)包含一个show0方法可用来显
示两个属性的值，包含一个构造器可以初始化两个属性，在main方法中定义两个Car类型的对象c,d并调用各自的方法。
 */
public class car {
    public int speed;
    public String name;
    car(int _speed, String _name){
        speed = _speed;
        name = _name;
    }
    public void show(){
        System.out.println("速度" + speed);
        System.out.println("名字" + name);
    }
    public static void main(String [] args){
        car c = new car(134, "yanhan");
        car d = new car(324,"rebecca");
        c.show();
        d.show();
    }
}
