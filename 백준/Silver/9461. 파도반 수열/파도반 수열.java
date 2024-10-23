import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] dp = new long[101];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;

        int T = sc.nextInt();
        for(int tc = 1; tc<=T; tc++){
            int n = sc.nextInt();

            for(int i = 5; i<=n; i++){
                dp[i] = dp[i-2] + dp[i-3];
            }

            System.out.println(dp[n]);
        }
    }
}