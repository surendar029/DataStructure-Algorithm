package DynamicProgramming;

public class ClimbStairs {

    static int climbStairs(int n) {
        if (n <= 2) return n;
        int past = 1, prev = 2;
        for (int i = 3; i <= n; i++) {
            int curr = past + prev;
            past = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(climbStairs(n));

    }
}
