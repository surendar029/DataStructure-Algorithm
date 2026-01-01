package LinkedList.Leetcode;

public class ReverseSegment {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Node heads=null;
        int L=2,R=6;
        for (int i = 1; i <=7;i++) {
            heads=linkedList.insertAtEnd(heads,i);
        }
        Node dummy = new Node(-1);
        dummy.next = heads;

        // 1. Move `prev` to the node BEFORE L
        Node prev = dummy;
        for (int i = 1; i < L; i++) {
            prev = prev.next;
        }

        // 2. Reverse the segment L to R
        Node curr = prev.next;     // first node of segment\
        Node next = null;
        Node prevs = null;
        Node tail = curr;          // this becomes the tail after reverse

        int count = R - L + 1;
        while (count-- > 0) {
            next = curr.next;
            curr.next = prevs;
            prevs = curr;
            curr = next;
        }
        linkedList.display(curr);
        linkedList.display(tail);
        // 3. Connect reversed segment
        prev.next = prevs;   // join prev part to new head of segment
        tail.next = curr;    // join tail to remaining part
    linkedList.display(dummy.next);
    }
}
