package Object_oriented2;
// 终结类：不能被继承
public final class FinalTest {

    // 常量：只能通过显示初始化或构造器初始化
    public final int x = 1;

    // 终结方法：不能被 重写
    public final void method() {
        // 局部常量
        final int y = 2;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FinalTest a = new FinalTest();
        System.out.println(a.x);
        //a.x = 2;
        a.method();
        System.out.println(a.x);
    }

}
