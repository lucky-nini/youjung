import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//테스트케이스

        for(int tc = 1; tc<=T; tc++){
            int N = sc.nextInt();//동전 몇가지?
            int[] coins = new int[N];
            for(int i = 0; i <N; i++){
                coins[i] = sc.nextInt();//동전 얼만지
            }
            int money = sc.nextInt();
            int[] dp = new int[money+1];

            dp[0] = 1; // 0원 만드는 방법: 1가지
            for (int coin : coins) {
                for (int j = coin; j <= money; j++) {
                    dp[j] += dp[j - coin];
                }
            }

            System.out.println(dp[money]);
        }
    }
}