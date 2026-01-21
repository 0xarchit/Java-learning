package LinkedList;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class basic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        Node y = new Node(arr[0]);
//        System.out.println(y.next);
//        Node x = new Node(arr[1]);
//        System.out.println(x.next);
        Node head = convertArr2LL(arr);
        head = insertFirst(head,0);
        printLL(head);
        System.out.println();
        head = insertLast(head,6);
        printLL(head);
        System.out.println();
        System.out.println(countNodes(head));

    }
    static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i<arr.length ; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static Node insertFirst(Node head,int val){
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }
    static Node insertLast(Node head , int val){
        Node newNode = new Node(val);
        if(head==null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static int countNodes(Node head){
        int c = 0;
        Node temp = head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    static int middleNode(Node head){
        if(head == null) return 0;
        Node temp1 = head;
        Node temp2 = head;
        while(temp1!=null && temp1.next!=null){
            temp1 = temp1.next.next;
            temp2 = temp2.next;
        }
        return temp2.data;

    }

}
