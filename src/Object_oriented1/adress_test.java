package Object_oriented1;

class Person{
    String name;
    int age;
    String sex;
    public Person(String _name, int _age, String _sex){
        name = _name;
        age = _age;
        sex = _sex;
    }
    public  Person getInfo(){
        System.out.println(name + age + sex);
        return null;
    }
}
public class adress_test {
    public static void main(String [] args){
        Person a = new Person("zhangsan", 20, "男");
        System.out.println("传址调用changeAge之前age="+a.age);
        changeAge(a);
        System.out.println("传引用调用changeAge之后age="+a.age);
    }
    public static void changeAge(Person p){
        p.age = 18;
    }
}
