package LinkedList;

public class LinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insertStart(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        this.head = newNode;
    }
    public void insertEnd(int val){
        Node newNode = new Node(val);

        if(this.head==null){
            this.head=newNode;
            return;
        }
        Node tmp = this.head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }
    public boolean search(int val){
        Node tmp = this.head;
        while(tmp!=null){
            if(tmp.data==val) return true;
            tmp=tmp.next;
        }
        return false;
    }
    public void display(){
        Node tmp = this.head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }
    public boolean compare(LinkedList ll){
        Node ptr1 = this.head;
        Node ptr2 = ll.head;
        while(ptr1!=null&&ptr2!=null) {
            if (ptr1.data != ptr2.data) return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1 == null && ptr2 == null;
    }
    public Node getMid(){
        if(this.head==null) return null;
        Node slow = this.head;
        Node fast = this.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node nNode(int n){
        return new Node(n);
    }
    public Node nLasNode(int n){
        Node slow = this.head;
        Node fast = this.head;
        return new Node(slow.data);
    }


}
class Main{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList dl = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll.insertStart(1);
        ll.insertStart(2);
        ll.insertStart(3);
        ll.insertStart(4);
        ll.insertEnd(5);
        ll2.insertStart(1);
        ll2.insertStart(2);
        ll2.insertStart(3);
        ll2.insertStart(4);
        ll2.insertEnd(5);
        ll.display();
        System.out.println(ll.search(5));
        System.out.println(ll.compare(dl));
        System.out.println(ll.compare(ll2));
        System.out.println(ll.getMid().data);
    }
}
