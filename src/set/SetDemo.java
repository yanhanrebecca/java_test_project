package set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class SetDemo {
    public static void main(String [] args){
        HashSet s = new HashSet();
        s.add("one");
        s.add("two");
        s.add(99);
        s.add(Integer.valueOf(3));
        s.add(Float.valueOf(4.0F));
        s.add("two");
//        s.remove(1);
//        System.out.println(":" + s.get(1));
        System.out.println(s);
        System.out.println("-----------------------------------");
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("s的元素个数是:" + s.size());
        System.out.println("-----------------------------------");
        //TreeSet元素排序存放
        TreeSet tree = new TreeSet();
        tree.add("one");
        tree.add("two");
        tree.add(Integer.valueOf(3).toString());
        tree.add(Float.valueOf(4.0F).toString());
        tree.add("two");
        System.out.println(tree);
    }
}
