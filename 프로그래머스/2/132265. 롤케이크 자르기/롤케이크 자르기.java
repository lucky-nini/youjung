class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int [] o1 = new int [10001]; 
        int [] o2 = new int [10001];
        int size = topping.length;
        int o1_cnt = 0; 
        int o2_cnt = 0; 
        
        for(int i = 0; i < size; i++){
            o2[topping[i]]++;
            if(o2[topping[i]] == 1) o2_cnt++;
        }
        
        for(int i = 0; i < size; i++){
            o1[topping[i]]++;
            if(o1[topping[i]] == 1) o1_cnt++;
            o2[topping[i]]--;
            if(o2[topping[i]] == 0) o2_cnt--;
            
            if(o1_cnt == o2_cnt) answer++;
        }
        
        return answer;
    }
}
