import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        dp[0] = 1; // 맨 앞애는 1
        
        int answer = 0;
        if(N == 1) answer = 1;

        for(int i = 1; i<N; i++){
            int max = 0;
            for(int j = i-1; j>=0; j--){ // 나보다 왼쪽애 있는 애들 다 비교
                if(A[i] > A[j] && dp[j] > max){
                    max = dp[j];
                }
                dp[i] = max + 1;
            }
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}