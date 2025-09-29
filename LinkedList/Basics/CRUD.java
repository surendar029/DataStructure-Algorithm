package LinkedList.Basics;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CRUD {

    static Node head;

    static void insertAtBegin(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    static void insertAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    static Node reverseList(){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static void print1() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            insertAtEnd(i);
        }
        print1();
        Node sat=reverseList();
        print1();
        print(sat);
    }
}

// 5-> 4-> 3-> 2-> 1-> null InsertAtBegin
// 1-> 2-> 3-> 4-> 5-> null InsertAtEnd