import java.io.*;
import java.util.*;

public class Main {
    // 상우하좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] map = new int[N][M];
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        while (true) {
            if (map[r][c] == 0) {
                count++;
                map[r][c] = 9;  //임의로 정함 청소한곳
            }

            boolean moved = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;
                int nx = r + dx[d];
                int ny = c + dy[d];

                // 90도 반시계 돌리고 청소안한곳 이동해
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] == 0) {
                    r = nx;
                    c = ny;
                    moved = true;
                    break;
                }
            }

            if (!moved) {
                int back = (d + 2) % 4;
                int bx = r + dx[back];
                int by = c + dy[back];

                // 후진해
                if (bx >= 0 && bx < N && by >= 0 && by < M && map[bx][by] != 1) {
                    r = bx;
                    c = by;
                } else {
                    // 후진 불가
                    break;
                }
            }
        }

        System.out.println(count);
    }
}