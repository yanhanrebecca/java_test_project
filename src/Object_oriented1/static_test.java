package Object_oriented1;
public class static_test{
    static  int  count=0;   //静态属性，也叫类属性,各对象共享此属性
    String   xh;      //学号
    String   name;    //姓名
    static_test(String  xh1,String name1){
        xh=xh1;
        name=name1;
        count++;
    }
    public  void show(){
        System.out.println("xh="+xh+"  name="+name);
    }
    public  static void showcount(){//静态方法，也叫类方法
        System.out.println("学生数是:"+count);
    }
    public static void main(String args[]){
        static_test  s1=new static_test("1","张三");
        static_test  s2=new static_test("2","李四");
        s1.show();
        s2.show();
        System.out.println("学生数是:"+static_test.count);
        static_test.showcount();
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.count);
        System.out.println(s2.count);
        s1.showcount();
        s2.showcount();
    }
}