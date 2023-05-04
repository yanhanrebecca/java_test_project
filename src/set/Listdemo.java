package set;
import java.util.ArrayList;
import java.util.List;
public class Listdemo {
    public static void main(String [] args){
        List li = new ArrayList();
        li.add("one");
        li.add("two");
        li.add(new Integer(3));
        li.add(new Float(4.0F));
        li.add("two");
        li.add(new Integer(3));
        li.add(1, "dasda");
        li.remove(1);
        if(li.contains("two")){
            System.out.println("you two!");
        }
        System.out.println(li);
        System.out.println("-------------------------");
        for(int i = 0; i < li.size(); i++)
            System.out.println(":" + li.get(i));
    }

}
