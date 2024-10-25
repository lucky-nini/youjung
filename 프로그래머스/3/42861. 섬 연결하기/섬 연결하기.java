import java.io.*;
import java.util.*;

class Solution {
    static int[] p;
    static int n;
    public int solution(int n, int[][] costs) {
        this.n = n;        
        p = new int[n];
        //비용으로 정렬하기
        Arrays.sort(costs, Comparator.comparing(o -> o[2]));

        makeset();
        
        int answer = 0;
        int cnt = 0;
        for(int[] cost : costs){
            if(union(cost[0], cost[1])){
                answer += cost[2];
                cnt++;
                
                if(cnt == n-1) break;
            }
        }
        
        return answer;
    }
    
    static void makeset(){
        for(int i = 0; i<n; i++){
            p[i] = i;
        }
    }
    
    static int findset(int a){
        if(p[a] == a){
            return a;
        }else{
            return p[a] = findset(p[a]);
        }
    }
    
    static boolean union(int a, int b){
        int aRoot = findset(a);
        int bRoot = findset(b);
        
        if(aRoot != bRoot){
            p[bRoot] = aRoot;
            return true;
        }
        
        return false;
    }
}