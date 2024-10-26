import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] list = new int[N][M];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                list[i][j] = sc.nextInt();
            }
        }
        
        int K = sc.nextInt();
        for(int i = 0; i<K; i++){
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            for(int j = a-1; j<c; j++){
                for(int k = b-1; k<d; k++){
                    sum += list[j][k];
                }
            }
            System.out.println(sum);

        }
    }
}