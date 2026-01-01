package Recursion.Leetcode;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: only one disk
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " → " + toRod);
            return;
        }

        // Move top n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Move largest disk to target
        System.out.println("Move disk " + n + " from " + fromRod + " → " + toRod);

        // Move n-1 disks from auxiliary to target
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
