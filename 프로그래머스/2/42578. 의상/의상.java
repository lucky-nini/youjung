import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<clothes.length; i++){
            String cloth = clothes[i][1];// 옷종류
            map.put(cloth,map.getOrDefault(cloth,0)+1);
        }
        
        int answer = 1;
        for(int x : map.values()){//값들만
            answer *= (x+1);
        }
        
        answer -= 1; //아무것도 안입어
        return answer;
    }
}