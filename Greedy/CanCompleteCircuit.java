package Greedy;

public class CanCompleteCircuit {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0;
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if (gasSum < costSum) return -1;
        int totalGas=0,index=0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i]-cost[i];
            if(totalGas<0){
                totalGas=0;
                index=i+1;
            }
        }
        return index;
    }
}
