import java.io.*;
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> arr = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>() {{
            put("code", 0);
            put("date", 1);
            put("maximum", 2);
            put("remain", 3);
        }};
        
        int remove = map.get(ext);
        int index = map.get(sort_by);
        
        // 조건에 맞는 데이터 추가
        for (int i = 0; i < data.length; i++) {
            if (data[i][remove] < val_ext) {
                arr.add(data[i]);
                System.out.println(Arrays.toString(data[i]));
            }
        }
        
        // 정렬
        arr.sort(Comparator.comparing(x -> x[index]));

        // 정렬된 결과를 int[][]로 변환
        int[][] answer = arr.toArray(new int[arr.size()][]);

        return answer;
    }
}
