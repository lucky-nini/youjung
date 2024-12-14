import java.util.*;

public class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int networkCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);
                networkCount++;
            }
        }
        
        return networkCount;
    }
    
    void dfs(int[][] computers, boolean[] visited, int current) {
        Stack<Integer> stack = new Stack<>();
        stack.push(current);
        
        while (!stack.isEmpty()) {
            int node = stack.pop();
            
            if (visited[node]) {
                continue;
            }
            
            visited[node] = true;
            
            for (int i = 0; i < computers[node].length; i++) {
                if (computers[node][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }
        }
    }
}
