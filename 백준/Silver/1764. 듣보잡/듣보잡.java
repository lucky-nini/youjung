import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//듣도 못한 사람
        int M = sc.nextInt();//보도 못한 사람

        Set<String> set = new HashSet<>();

        //듣도 못한 사람들
        for(int i = 0; i<N; i++){
            set.add(sc.next());
        }

        Set<String> answer = new TreeSet<>();
        for(int i = 0; i<M; i++){
            String name = sc.next();
            if(set.contains(name)){
                answer.add(name);
            }
        }

        System.out.println(answer.size());
        for(String ans : answer){
             System.out.println(ans);
        }
    }
}