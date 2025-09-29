package LinkedList.Leetcode;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Node head=null;
        for (int i = 1; i < 6;i++) {
            head=linkedList.insertAtEnd(head,i);
        }
        linkedList.display(head);
        Node next=null;
        Node prev=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        linkedList.display(prev);
    }
}
