package LinkedList.Leetcode;

public class LinkedList {
    public Node insertAtBeginning(Node head,int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        return head;
    }
    public Node insertAtEnd(Node head,int val){
        Node node=new Node(val);
        if(head==null){
            return node;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
