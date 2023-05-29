package Object_oriented1;

public class StaticTest2 {// 初始化顺序
    static int a = 1;
    {
        a = 2;
        System.out.println("代码块"+ a);
    }
    // 仅执行一次
    static {
        a = 3;
        System.out.println("静态块"+a);
    }
    public StaticTest2() {//构造器

        a = 4;
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        StaticTest2 s=new StaticTest2();
        //System.out.println(new StaticTest2().a);
        System.out.println(s.a);
        System.out.println(new StaticTest2().a);
    }
}

