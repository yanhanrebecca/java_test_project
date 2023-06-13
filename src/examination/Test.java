package examination;

public class Test {
    public void test1() {
        PClass p1 = new PClass("张三");
        p1.showName();
        p1.showBlood(); // 报错,没有blood
        p1.setBlood("A");
        p1.showBlood();
    }

    public void test2() {
        PClass p2 = new PClass("李四", "B");
        p2.showName();
        p2.showBlood();
    }
}
