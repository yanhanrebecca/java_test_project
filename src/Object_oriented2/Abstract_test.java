package Object_oriented2;
abstract class CC{//抽象类,就是作为父类
    //它只有被继承，才能被使用
    abstract void callme();//抽象方法
    void metoo(){
        System.out.println("Inside CC's metoo() method");
    }
}
class DD extends CC{
    void callme(){
        System.out.println("Inside D's callme() method");
    }
}
public class Abstract_test{
    public static void main(String args[]){
        CC c = new DD();
        c.callme();
        c.metoo();
    }
}

