package examination;

public class Test {
    public static void main(String[] args) {
        PClass p1 = new PClass("张三");
        p1.showName();
        p1.showBlood();   // 没有blood属性,为null
        p1.setBlood("A");
        p1.showBlood();

        PClass p2 = new PClass("李四", "B");
        p2.showName();
        p2.showBlood();

        System.out.println(PClass.getCount());  // 输出2
    }
}
