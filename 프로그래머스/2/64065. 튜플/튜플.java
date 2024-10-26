import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] items = s.split("},\\{");
        // 각 문자열을 길이 순으로 정렬
        Arrays.sort(items, (a, b) -> a.length() - b.length());
        
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (String item : items) {
            String[] numbers = item.split(",");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (set.add(num)) {
                    result.add(num);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
