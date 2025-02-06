package datastructure;

import java.util.HashMap;

public class MainCCLinkedList {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        CustomLinkedList cc = new CustomLinkedList();
        cc.addToLinkedList(1);
        cc.addToLinkedList(2);
        cc.addToLinkedList(3);
        cc.addToLinkedList(4);
        cc.addToLinkedList(5);
        cc.addToLinkedList(6);
        cc.printList();
    }
}
class CustomLinkedList<T>{
    Node head;
    public void addToLinkedList(T data){
        if(data!=null){
          Node n = new Node(data);
            n.next=head;
            head=n;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("nothing to print");
        }else{
           Node cn=head;
           while(cn.next!=null){
               System.out.print(cn.data+"--->");
               cn=cn.next;
           }
            System.out.print(cn.data);
        }

    }
}
class Node<T>{
    T data;
    Node next;
    public Node(T data){
        this.data = data;
        this.next=null;
    }
}

