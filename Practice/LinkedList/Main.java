//package LinkedList;
///**
//public class Node{
//    int data;
//    Node next;
//    public Node(int val){
//        this.data = val;
//        this.next = null;
//    }
//}
//public class Main {
//    public static void printList(Node head){
//        Node ptr = head;
//        while(ptr!=null){
//            System.out.print(ptr.data+"-->");
//            ptr = ptr.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//        Node n4 = new Node(40);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//
//        n4 = null; // remove reference (pointer) not object changed to null
//        n3 = null;
//        n2 = null;
//
//        System.out.println(n1.data);
//        n1 = n1.next;
//        System.out.println(n1.data);
//        n1 = n1.next;
//        System.out.println(n1.data);
//        n1 = n1.next;
//        System.out.println(n1.data);  // losing all nodes after printing need extra variable.
////        n1 = n1.next
////        System.out.println(n1.data); null pointer exception
//
////        Node head = n1;
////
////        while (head != null) {
////            System.out.println(head.data);
////            head = head.next;
////        }
//        printList(n1);
//    }
//}
//**/