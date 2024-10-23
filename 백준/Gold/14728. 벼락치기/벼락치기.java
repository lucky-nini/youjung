import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//단원 개수
        int T = sc.nextInt();//총시간

        int[] dp = new int[T+1];

        int answer = 0;// 최대값 찾기

        for(int i = 0; i<N; i++){
            //입력 받으면서 바로 갱신하기
            int K = sc.nextInt(); //공부시간
            int S = sc.nextInt();//배점

            for(int j = T; j>=K; j--){
                dp[j] = Math.max(dp[j], dp[j-K] + S);
                answer = Math.max(answer, dp[j]);
            }
        }
        System.out.println(answer);
    }
}