import java.io.*;
import java.util.*;

class Solution {
    public long solution(long n) {
        String text = Long.toString(n);
        int[] list = new int[text.length()];
        
        for(int i = 0; i<text.length(); i++){
            list[i] = Integer.parseInt(text.substring(i,i+1));
        }
        
        Arrays.sort(list);
        String temp ="";
        
        for(int i = list.length-1; i>=0; i--){
            temp += list[i];
        }
        
        long answer = Long.parseLong(temp);
        return answer;
    }
}