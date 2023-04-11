package Object_oriented2;
public class MyStack {
    private int[] data;
    private int top = -1;
    private int size;  //最大容量

    public MyStack() {
        data = new int[100];
        this.size = 100;
    }

    public MyStack(int size) {
        data = new int[size];
        this.size = size;
    }

    public void push(int obj) {
        if (top < size - 1) {
            top++;

            this.data[top] = obj;
        }
        else System.out.println("栈满！");
    }

    public int pop() {
        int t;

        if (top > -1) {
            t = this.data[top];
            top--;
            return  t;
        }
        System.out.println("栈空！");
        return -9999;
    }

    public void printAll() {
        for (int i = 0; i <= top; i++) {
            System.out.println(data[i]);
        }
    }

}

