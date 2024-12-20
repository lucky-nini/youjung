import java.io.*;
import java.util.*;

class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    static int[][] maps;
    
    public int solution(int[][] maps) {
        this.maps = maps;
        visited = new boolean[maps.length][maps[0].length];
        int answer = bfs(0,0);//시작위치
        return answer;
    }
    
    static int bfs(int a, int b){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a,b,1});
        visited[a][b] = true;
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            int count = now[2];//거리
            
            //도착~
            if(x == maps.length-1 && y == maps[0].length-1){
                return count;
            }
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && nx<maps.length && ny>=0 && ny<maps[0].length && 
                   !visited[nx][ny] && maps[nx][ny] == 1){
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx,ny,count+1});
                }
            }
        }
        return -1;
        
    }
}

//DFS로 풀어볼라했는데 > 시간 초과  ㅜ 그냥 BFS로 풀자 
// import java.io.*;
// import java.util.*;

// class Solution {
//     static int[] dx = {-1, 1, 0, 0};
//     static int[] dy = {0, 0, -1, 1};
//     static boolean[][] visited;
//     static int[][] maps;
//     static int min;

//     public int solution(int[][] maps) {
//         this.maps = maps;
//         visited = new boolean[maps.length][maps[0].length];
//         min = Integer.MAX_VALUE;

//         // 시작위치!
//         dfs(0, 0, 1);

//         if(min == Integer.MAX_VALUE){
//             return -1; 
//         }
        
//         return min;
//     }

//     static void dfs(int x, int y, int count) {
//         if (x < 0 || x >= maps.length || y < 0 || y >= maps[0].length 
//             || visited[x][y] || maps[x][y] == 0) {
//             return;
//         }

//         if (count >= min) {
//             return;
//         }
        
//         if (x == maps.length - 1 && y == maps[0].length - 1) {
//             min = Math.min(min, count);
//             return;
//         }
//             visited[x][y] = true;
//             for (int i = 0; i < 4; i++) {
//                 int nx = x + dx[i];
//                 int ny = y + dy[i];
//                 dfs(nx, ny, count + 1);
//             }
//             visited[x][y] = false;
//     }
// }

