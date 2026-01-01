package LinkedList.Basics;

public class MiddleNode {
    public static void main(String[] args) {
        Node head = null;
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < 5; i++) {
            head = linkedList.insertAtEnd(head, i);
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        linkedList.display(slow);

        Node prev = null, next = null;
        Node curr = slow;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        linkedList.display(prev);
        linkedList.display(head);
        Node first = head, second = prev;
        while (second != null && first != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        linkedList.display(head);
    }
}
