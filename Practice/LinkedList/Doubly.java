package LinkedList;

class DoublyLinkedList {

    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head of list
    Node head;

    // Insert at beginning
    void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at specific position (1-based index)
    void insertAtPosition(int pos, int data) {
        if (pos <= 0) return;

        if (pos == 1) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) return;

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Delete from start
    void deleteFromStart() {
        if (head == null) return;

        if (head.next != null) {
            head.next.prev = null;
        }

        head = head.next;
    }

    // Delete from end
    void deleteFromEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete by value
    void deleteByValue(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display backward
    void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Search element
    int search(int value) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == value) {
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Count nodes
    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Reverse list
    void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    // Get middle element
    int getMiddle() {
        if (head == null) return -1;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // Main method (testing)
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtStart(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtPosition(2, 15);

        dll.displayForward();
        dll.displayBackward();

        System.out.println("Count: " + dll.countNodes());
        System.out.println("Search 20: " + dll.search(20));
        System.out.println("Middle: " + dll.getMiddle());

        dll.deleteByValue(15);
        dll.deleteFromStart();
        dll.deleteFromEnd();

        dll.displayForward();

        dll.reverse();
        dll.displayForward();
    }
}
