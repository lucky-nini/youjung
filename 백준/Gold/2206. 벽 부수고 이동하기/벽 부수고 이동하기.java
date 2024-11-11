import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(BFS());
    }

    static int BFS() {
        Queue<int[]> q = new LinkedList<>();
        boolean[][][] visited = new boolean[N][M][2];
        q.offer(new int[]{0, 0, 1, 1});
        visited[0][0][1] = true;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];
            int canBreak = now[3];

            if (x == N - 1 && y == M - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (map[nx][ny] == 0 && !visited[nx][ny][canBreak]) {
                        visited[nx][ny][canBreak] = true;
                        q.offer(new int[]{nx, ny, dist + 1, canBreak});
                    }
                    else if (map[nx][ny] == 1 && canBreak == 1 && !visited[nx][ny][0]) {
                        visited[nx][ny][0] = true;
                        q.offer(new int[]{nx, ny, dist + 1, 0});
                    }
                }
            }
        }
        return -1;
    }
}