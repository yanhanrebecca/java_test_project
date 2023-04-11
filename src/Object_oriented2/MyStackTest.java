package Object_oriented2;
public class MyStackTest {
    public static void main(String[] args) {
        int t;
        MyStack stack = new MyStack();

        // 入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.printAll();

        // 出栈
        t=stack.pop();
        if(t!=-9999)  System.out.println("弹出的栈顶元素为："+t);
        t=stack.pop();
        if(t!=-9999)  System.out.println("弹出的栈顶元素为："+t);
        stack.printAll();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
