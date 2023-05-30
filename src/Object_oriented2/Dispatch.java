package Object_oriented2;
class A{
    void call(){
        System.out.println("A's call() method");
    }
}
class B extends A{
    void call(){
        System.out.println("B's call() method");
    }
    void other(){
        System.out.println("B......");
    }
}
public class Dispatch{
    public static void main(String args[]){
        A a= new B();
        A c = new A();
        //也叫对象转换，反过来不可以,如（B a= new A()）
        a.call(); //可以调用a.other吗?
        System.out.println("---------------------------------");
        B b=new B();
        ((A)b).call();
    }
} //Dispatch
