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
        //也叫对象转换，反过来不可以（B a= new A()
        a.call(); //可以调用a.other吗?
        /*A aa=new A();
        ((B)aa).call();
        ((B)aa).other();*/
       /* B b=new B();
        ((A)b).call();*/
    }
} //Dispatch
