package Object_oriented1;
public class StringChuan{
    public static void change(StringBuffer s){
        //s="张三丰";

        s.append("丰");

    }
    static void changeName(Person p,String s) {
        p.name = s;
    }
    public static void main(String[] args)
    {
        StringBuffer s= new StringBuffer("张三");
        change(s);
        System.out.println(s.toString());


        Person p=new Person("里斯",32,"男");
      	changeName(p,"张三丰");
      	p.getInfo();
    }
}