package Object_oriented2;
public class ObjectInstance {
    //默认继承了 Object类
    public String toString() {
        // 方法重写toString()方法
        return "在" + getClass().getName() +
                "类中重写toString()方法";
    }

    public static void main(String[] args) {
        System.out.println(new ObjectInstance());
        // 打印本类对象
        System.out.println(new ObjectInstance().toString());

    }
}
