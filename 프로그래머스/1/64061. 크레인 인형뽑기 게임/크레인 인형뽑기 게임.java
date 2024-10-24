import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        
        int answer = 0;
        for(int move : moves){
            int pick = 0; //꺼낸 인형
            for(int i = 0; i<board[0].length; i++){
                if(board[i][move-1] != 0){
                    pick = board[i][move-1];
                    board[i][move-1] = 0;
                    break;
                }
            }
            
            if(!stack.isEmpty() && pick != 0){
                if(stack.peek() == pick){
                    stack.pop();
                    answer += 2; //두개 같이 터져
                }else{
                    stack.add(pick);
                }
            }else{
                stack.add(pick);
            }
            
        }
        return answer;
    }
}