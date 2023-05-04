package set;
import java.util.ArrayList;
public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<E>();
    public int getSize(){
        return list.size();
    }
    public E getTop(){
        return list.get(getSize() - 1);
    }
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        if(list.isEmpty()) return null;
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    //方法覆盖，重写
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String toString(){
        return "stack: " + list.toString();
    }
    public static void main(String [] args){
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Berlin");
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        System.out.println(stack1);
        System.out.println(stack2);
        GenericStack stack3 = new GenericStack();
        stack3.push(1);
        stack3.push("London");
        System.out.println(stack3);
    }
}
