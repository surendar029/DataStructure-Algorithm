package LinkedList.Leetcode;

public class DeleteAllOccurrences {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Node head=null;
        head= linkedList.insertAtEnd(head,10);
        head= linkedList.insertAtEnd(head,20);
        head=linkedList.insertAtEnd(head,30);
        head= linkedList.insertAtEnd(head,20);
        head=linkedList.insertAtEnd(head,50);
        int x=10;
        Node dummy=new Node(-1);
        dummy.next=head;

        Node prev=dummy;
        Node curr=head;

        while(curr!=null){
            if(curr.data==x){
                prev.next=curr.next;
            }else{
                prev=curr;
            }
            curr=curr.next;
        }
        linkedList.display(dummy);

    }
}
