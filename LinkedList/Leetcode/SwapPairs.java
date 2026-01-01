package LinkedList.Leetcode;

public class SwapPairs {
    public static void main(String[] args) {
        Node head = null;
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < 5; i++) {
            head = linkedList.insertAtEnd(head, i);
        }
        Node dummy = new Node(0);
        dummy.next = head;

        Node point=dummy;
        while(point.next!=null && point.next.next!=null){
            Node swap1=point.next;
            Node swap2=point.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            point.next=swap2;
            point=swap1;
        }
//        linkedList.display(dummy);
// \u000d System.out.println("Done");

    }
}
