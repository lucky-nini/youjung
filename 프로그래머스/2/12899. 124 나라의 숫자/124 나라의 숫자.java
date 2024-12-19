import java.io.*;
import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";

        while (n > 0) {
            int a = n % 3;
            if (a == 0) {
                answer = "4" + answer;
                n = n / 3 - 1; 
            } else if (a == 1) {
                answer = "1" + answer;
                n = n / 3;
            } else { 
                answer = "2" + answer;
                n = n / 3;
            }
        }

        return answer;
    }
}