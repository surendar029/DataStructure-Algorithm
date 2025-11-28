package Queue.Leetcode;

public class MyCircularQueue {
    private int[] queue;
    private int front, rear, capcity, size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        capcity = k;
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()){
            front=0;
            rear=0;
        }else{
            rear=(rear+1)%capcity;
        }
        queue[rear]=value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front=(front+1)%capcity;
        }
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==capcity;
    }

    public static void main(String[] args) {
        MyCircularQueue q=new MyCircularQueue(3);
        System.out.println(q.enQueue(1));
        System.out.println(q.enQueue(2));
        System.out.println(q.enQueue(3));
        System.out.println(q.enQueue(4));
        System.out.println(q.front);
        System.out.println(q.rear);
        System.out.println(q.deQueue());
        System.out.println(q.front);
        System.out.println(q.rear);

    }
}
