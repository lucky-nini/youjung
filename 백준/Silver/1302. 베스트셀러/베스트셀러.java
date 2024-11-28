import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for(int i = 0; i<N; i++){
            String book = sc.next();
            map.put(book, map.getOrDefault(book,0)+1);
        }

        String bestbook = "";
        int max = 0;

        for (Map.Entry<String, Integer> books : map.entrySet()) {
            String bookname = books.getKey();

            if (books.getValue() > max) {
                max = books.getValue();
                bestbook = bookname;
            }
        }

        System.out.println(bestbook);
    }
}