import java.io.*;
import java.util.*;

class Solution {
    public int solution(int N, int number) {
        // 몇번 사용하는지 리스트
        List<HashSet<Integer>> list = new ArrayList<>();
        
        // 8번 이상은 못만들어서 8까지만 만들어도 됨
        for(int i = 0; i<=8; i++){
            list.add(new HashSet<Integer>());
        }
        
        //1번 사용 => 자기자신만 들어가
        list.get(1).add(N);
        
        if(number == N) {
            return 1;
        }
        
        for(int i = 2; i<= 8; i++){
            HashSet<Integer> total = list.get(i);
            
            for(int j =1; j<i; j++){ 
                HashSet<Integer> a = list.get(j); 
                HashSet<Integer> b = list.get(i-j);
                
                for(int x : a){
                    for(int y : b){
                        total.add(x+y);
                        total.add(x-y);
                        total.add(x*y);
                        if(x!=0 && y!=0) total.add(x/y);
                    }
                }
            }
            
            //N을 i번씩 연결한애도 넣어줘
            total.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            
            //근데 이제 최소값 구하는거니까 있으면 바로 리턴해
            if(total.contains(number)) return i;
        }
        
        return -1;
    }
}