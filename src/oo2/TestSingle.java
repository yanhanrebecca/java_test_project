package oo2;
class  Single{//单例模式练习，单例限制了实例的个数，节省资源
    private String name;
    private static Single onlyone = new Single();
    private  Single(){}//！！！！只能在本类中使用，如果不写构造器，系统自动给一个public Single(){}
    public  void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static  Single getSingle(){
        return onlyone;
    }
}
public class TestSingle {
    public  static void m1(){
        Single s2 = Single.getSingle();
        System.out.println(s2.getName());
    }
    public static void main(String [] args){
        Single s1 = Single.getSingle();
        //Single Two = new Single();
        s1.setName("Tom");
        m1();
    }
}
