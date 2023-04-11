package Object_oriented2;

import java.util.Scanner;
public class SingleLinkList {
    Node head=null;  //链表的头指针
    public void createList(int n) {
        //创建含n个结点的带头结点的单链表(尾插法)
        if(n<1) return;
        head = new Node();//生成头结点
        Node r,p;
        int data;
        r=head;  //r在链表尾部
        System.out.println("输入"+n+"个整数，用来创建单链表");
        Scanner reader=new Scanner(System.in);
        for(int i=1;i<=n;i++) {
            data=reader.nextInt(); //由键盘输入一个整数
            p=new Node(data); //申请一个结点
            r.next=p; //将新来结点链接在r的后面
            r=p; //r指向p
        }
        reader.close();
    }
    public void printList() {
        Node p;
        System.out.print("The List:");
        p=head.next; //p指向链表的第一个结点
        while(p!=null) {
            System.out.print(p.data+"\t");
            p=p.next;
        }
        System.out.println(); //换行
    }
    public int length() {
        //返回单链表的长度，不包括头结点
        Node p;
        p=head.next;
        int count=0;
        while(p!=null) {
            count++;
            p=p.next;
        }
        return count;
    }
    public boolean insertList(int i,int e) {
        //在链表的第i个结点前插入一个值为e的结点，插入成功返回true，否则返回false
        Node p=head;
        int j=0;
        if(i<1) return false;
        while(p!=null&&j<i-1) {
            j++;
            p=p.next;
        }
        if(p==null) return false;
        Node q=new Node(e);
        q.next=p.next;
        p.next=q;
        return true;
    }
    public boolean deleteList(int i) {
        //删除链表的第i个结点，删除成功返回true，否则返回false
        Node p=head;
        int j=0;
        if(i<1) return false;
        while(p!=null&&j<i-1) {
            j++;
            p=p.next;
        }
        if(p==null||p.next==null) return false;
        p.next=p.next.next;
        return true;
    }
    public static void main(String[] args) {
        SingleLinkList L=new SingleLinkList();
        L.createList(5);
        L.printList();
        System.out.println("length="+L.length());
        if(L.insertList(2, 99)) {
            System.out.println("insert success!");
            L.printList();
        }
        L.deleteList(2);
        L.printList();

    }

}
