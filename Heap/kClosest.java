package Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Triplet {
    double root;
    int x, y;

    public Triplet(double root, int x, int y) {
        this.root = root;
        this.x = x;
        this.y = y;
    }
}

class TripletComparator implements Comparator<Triplet> {
    @Override
    public int compare(Triplet a, Triplet b) {
        if (a.root > b.root) {
            return 1;
        } else if (a.root < b.root) {
            return -1;
        }
        return 0;
    }
}

public class kClosest {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int k=1;
        Queue<Triplet> queue = new PriorityQueue<Triplet>(new TripletComparator());
        for (int[] point : points) {
            double root = Math.sqrt(((-point[0]) * (-point[0])) + ((-point[1]) * (-point[1])));
            queue.add(new Triplet(root,point[0],point[1]));
        }
        int[][] res=new int[k][2];
        int index=0;
        while(k-->0){
            res[index][0]=queue.peek().x;
            res[index][1]=queue.peek().y;
            index++;
            queue.remove();
        }
        for(int[] r:res){
            System.out.println(Arrays.toString(r));
        }
    }
}
