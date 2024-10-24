import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static boolean[] check;
    static int[] dx = {2,-1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        check = new boolean[100001];

        int answer = BFS(N, K);
        System.out.println(answer);
    }

    static int BFS(int N, int K) {
        Queue<int[]> q = new LinkedList<>();
        check[N] = true;
        q.offer(new int[]{N, 0}); // 위치 + 시간

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int time = cur[1];

            if (x == K) return time; // K에 도착

            for (int i = 0; i < 3; i++) {
                int nx;
                if (i == 0) {
                    nx = x * dx[i];
                } else {
                    nx = x + dx[i];
                }

                if (nx >= 0 && nx < 100001 && !check[nx]) {
                    check[nx] = true;
                    if (i == 0) { // 순간 이동일 때는 시간 증가 없이 추가
                        q.offer(new int[]{nx, time});
                    } else { // 나머지 이동일 때는 시간 1 증가
                        q.offer(new int[]{nx, time + 1});
                    }
                }
            }
        }
        return -1;
    }
}