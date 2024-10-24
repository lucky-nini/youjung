import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j<M; j++){
                map[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }

        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }

    static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});

        while(!q.isEmpty()){
            int now[] = q.poll();
            visited[i][j] = true;

            for(int k = 0; k<4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x>=0 && x<N && y>=0 && y<M){
                    if(map[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;
                        map[x][y] = map[now[0]][now[1]] +1;
                        q.offer(new int[] {x,y});
                    }
                }
            }
        }
    }
}