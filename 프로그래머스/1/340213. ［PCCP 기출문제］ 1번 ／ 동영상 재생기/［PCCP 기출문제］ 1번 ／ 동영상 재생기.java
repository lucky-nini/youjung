import java.io.*;
import java.util.*;

class Solution {
    public String solution(String video_len, String pos,
                           String op_start, String op_end, String[] commands) {
        String answer = "";
        
        // 시간들을 다 숫자로 바꿔두자..!
        int videonum = Integer.parseInt(video_len.substring(0,2)) * 60 
            + Integer.parseInt(video_len.substring(3,5));
        int posnum = Integer.parseInt(pos.substring(0,2)) * 60 + Integer.parseInt(pos.substring(3,5));
        int startnum = Integer.parseInt(op_start.substring(0,2)) * 60
                    + Integer.parseInt(op_start.substring(3,5));
        int endnum = Integer.parseInt(op_end.substring(0,2))* 60
                    + Integer.parseInt(op_end.substring(3,5));
        // System.out.println("총길이"+videonum+"지금"+posnum+"시작"+startnum+"끝"+endnum);
        
        for(String command : commands){
            if(posnum >= startnum && posnum <= endnum){
                posnum = endnum;
            }
            
            if(command.equals("next")){
                if(videonum - posnum < 10){
                    posnum = videonum;
                }else{
                    posnum += 10;
                }
            }else{ //"prev"
                if(posnum < 10){
                    posnum = 0;
                }else{
                    posnum -= 10;
                }
            }
            
            if(posnum >= startnum && posnum <= endnum){
                posnum = endnum;
            }
        }
        
        String answer_1 ="";
        String answer_2 ="";
    
        if(posnum/60 < 10){
            answer_1 = "0"+Integer.toString(posnum/60);
        }else{
            answer_1 = Integer.toString(posnum/60);
        }
        
        
        if(posnum%60 < 10){
            answer_2 = "0"+Integer.toString(posnum%60);
        }else{
            answer_2 = Integer.toString(posnum%60);
        }
        
        answer = answer_1 +":"+answer_2;
        
        return answer;
    }
}