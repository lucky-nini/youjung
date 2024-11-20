import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] time = new int[N + 2];
        int[] pay = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            time[i] = sc.nextInt();
            pay[i] = sc.nextInt();
        }

        int[] dp = new int[N + 2];
        int max = 0;

        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
            int day = i + time[i];
            if (day <= N + 1) {
                dp[day] = Math.max(dp[day], max + pay[i]);
            }
        }

        max = Math.max(max, dp[N + 1]);
        System.out.println(max);
        sc.close();
    }
}