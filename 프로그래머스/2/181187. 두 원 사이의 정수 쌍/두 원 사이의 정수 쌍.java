import java.util.*;
class Solution {
    public long solution(int r1, int r2) {
        long answer = (long)(r2 - r1 + 1) *4L;
        int y1 = 0;
        int y2 = 0;
        
        for(int x = 1; x < r2; x++){
            y1 = (int)Math.sqrt((long)r1 * r1-(long)x * x);
            y2 = (int)Math.sqrt((long)r2 * r2-(long)x * x);
            answer += (long)(y2 - y1)*4;

            if(x < r1 && Math.sqrt((long)r1*r1-(long)x*x)%1 ==0) answer+=4L;
        }
        return answer;
    }
}
