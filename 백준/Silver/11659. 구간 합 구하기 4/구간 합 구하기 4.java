import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sum = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=N; i++){
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

//        System.out.println(Arrays.toString(sum));
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(sum[B] - sum[A-1]);
        }

    }
}