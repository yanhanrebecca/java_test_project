package Object_oriented;
class student{
    String name;
    int birth;
    student(){}
    student(String _name, int _birth){
        name = _name;
        birth = _birth;
    }
    public void show(){
        //公用方法
        System.out.println("姓名：" + name);
        System.out.println("生日：" + birth);
    }
}
public class student_test {
    public static void main(String [] args){
        student d1 = new student("张三", 19510101);
        student d2 = new student("李四", 20001229);
        System.out.println("对象d2的属性及方法");
        System.out.println("姓名：" + d1.name);
        System.out.println("生日：" + d1.birth);
        d1.show();
        d1.name = "张三疯";
        System.out.println("修改后对象d1的属性以及方法");
        d1.show();
        System.out.println("对象d2的属性以及方法");
        d2.show();
    }

}
