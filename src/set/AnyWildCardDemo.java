package set;

public class AnyWildCardDemo {
    public static void main(String [] args){
        GenericStack<Integer> stack1 = new GenericStack<>();
        stack1.push(1);
        stack1.push(2);
        GenericStack<Double> stack2 = new GenericStack<>();
        stack2.push(1.23);
        stack2.push(2.34);
        printPop(stack1);
        System.out.println();
        printPop(stack2);
        GenericStack<String> stack3 = new GenericStack<>();
        stack3.push("London");
        stack3.push("Berlin");
        GenericStack<Object> stack4 = new GenericStack();
        stack4.push(1);
        stack4.push("London");
        AnyWildCardDemo.<String>add(stack3, stack4);
        System.out.println(stack4);
    }
    public static void printPop(GenericStack<? extends Number> stack){
        while (!stack.isEmpty())
            System.out.println(stack.pop() + "  ");
    }
    /*通配泛型
    1。非受限通配：？
    2。受限通配：？ extends T(T或者T的子类型)
    3。下限通配：？ super T(T或者T的父类型)
     */
    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2){
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }
}
