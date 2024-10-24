import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        //공원크기
        int parkRows = park.length;
        int parkCols = park[0].length;

        for (int size : mats) {

            for (int i = 0; i <= parkRows - size; i++) {
                for (int j = 0; j <= parkCols - size; j++) {
                    
                    boolean canPlaceMat = true;

                    for (int x = i; x < i + size; x++) {
                        for (int y = j; y < j + size; y++) {
                            if (!park[x][y].equals("-1")) {
                                canPlaceMat = false;
                                break;
                            }
                        }
                        if (!canPlaceMat) break; 
                    }

                    if (canPlaceMat) {
                        answer = Math.max(answer, size);
                    }
                }
            }
        }
        
        return answer;
    }
}
