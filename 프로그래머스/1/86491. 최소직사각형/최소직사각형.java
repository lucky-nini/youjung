import java.io.*;
import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        //더 긴 애를 왼쪽에 정렬시켜
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        int max_x = 0;
        int max_y = 0;
        
        for(int i = 0; i<sizes.length; i++){
            max_x = Math.max(max_x, sizes[i][0]);
            max_y = Math.max(max_y, sizes[i][1]);
        }
        
        int answer = max_x * max_y;
        return answer;
    }
}