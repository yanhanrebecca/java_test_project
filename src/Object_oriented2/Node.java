package Object_oriented2;

public class Node { //结点的定义
    int data; //数据域
    Node next; //引用，下一个结点
    public Node() {
        next=null;
    }
    public Node(int data) {
        this();
        this.data=data;
    }
}
