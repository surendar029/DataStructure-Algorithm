package LinkedList.Leetcode;

public class OddEvenList {
    public static void main(String[] args) {
        Node head=null;
        LinkedList linkedList=new LinkedList();
        for (int i = 1; i < 8; i++) {
            head=linkedList.insertAtEnd(head,i);
        }
        linkedList.display(head);
    }
}
