import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        int max = 0;//제일 높은 건물
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                map[i][j] = sc.nextInt();
                max = Math.max(max, map[i][j]);
            }
        }

        int result = 1; //하나도 안잠겨
        
        // 1부터 max까지
        for(int rain = 1; rain<=max; rain++){
            visited = new boolean[N][N];
            int cnt = 0;

            for(int i= 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(map[i][j] > rain && !visited[i][j]){
                        DFS(i,j,rain);
                        cnt++;
                    }
                }
            }

            result = Math.max(result, cnt);
        }

        System.out.println(result);
    }

    static void DFS(int x, int y,int rain){
        visited[x][y] = true;

        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx<N && ny>= 0 && ny<N && !visited[nx][ny] && map[nx][ny] > rain){
                DFS(nx,ny,rain);
            }
        }
    }
}