import java.io.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        int cnt = 0; 
        
        // s를 짤라서 회전..?
        String new_s = "";
        for(int i = 0; i<s.length(); i++){
            new_s = s.substring(i)+ s.substring(0,i); 
            // System.out.println(new_s);
            
            //올바른 문자열인지 판단하기
            Stack<Character> stack = new Stack<>();
            
            for(char c : new_s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            
            if(c == ')' && stack.peek() == '('){
                stack.pop();
                continue;
            }else if(c == '}' && stack.peek() == '{'){
                stack.pop();
                continue;
            }else if(c == ']' && stack.peek() == '['){
                stack.pop();
                continue;
            }   
            
                stack.push(c);
            }   
            
            if(stack.isEmpty()){
                cnt++;
            }
        }
      
        return cnt;
    }
}