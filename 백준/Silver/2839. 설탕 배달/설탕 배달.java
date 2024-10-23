import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println(-1);
            return;
        }

        int[] dp = new int[N + 1];
        Arrays.fill(dp, 9999);

        dp[3] = 1;
        if (N >= 5) dp[5] = 1;

        for (int i = 6; i <= N; i++) {
            dp[i] = Math.min(dp[i - 3] + 1, dp[i - 5] + 1);
        }

        if (dp[N] >= 9999) {
            System.out.println(-1);
        } else {
            System.out.println(dp[N]);
        }
    }
}