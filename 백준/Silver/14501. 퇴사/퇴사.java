import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] time = new int[N];
        int[] money = new int[N];

        for(int i = 0; i<N; i++){
            time[i] = sc.nextInt();
            money[i] = sc.nextInt();
        }

        int[] dp = new int[N+1];

        for(int i = 0; i<N; i++){
            if(i + time[i] <= N){
                dp[i+time[i]] = Math.max(dp[i+time[i]], dp[i]+ money[i]);
            }
            dp[i+1] = Math.max(dp[i+1],dp[i]);
        }

        System.out.println(dp[N]);
    }
}