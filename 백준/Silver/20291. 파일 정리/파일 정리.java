import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for(int i = 0; i<N; i++){
            String fileName = sc.next();
            String[] splitName = fileName.split("[.]");
            map.put(splitName[1], map.getOrDefault(splitName[1],0)+1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}