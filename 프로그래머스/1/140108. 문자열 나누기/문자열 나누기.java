import java.io.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int[] cnt_list = new int[2]; // 같은 글씨 카운트 | 다른 글씨 카운트
        
        char target = s.charAt(0);//맨 왼쪽 글씨
        for(int i = 0; i<s.length(); i++){
            if(target == s.charAt(i)){
                cnt_list[0]++;
            }else{
                cnt_list[1]++;
            }
            
            if(cnt_list[0] == cnt_list[1]){ // 개수가 같으면
                answer++;
                cnt_list = new int[2];//초기화 
                target = s.charAt((i+1) % s.length());
            }
        }
        
        if(cnt_list[0] != cnt_list[1]){
            answer++;
        }
        return answer;
    }
}