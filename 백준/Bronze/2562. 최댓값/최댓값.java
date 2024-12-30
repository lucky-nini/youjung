import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[9];

        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < 9; i++) {
            list[i] = sc.nextInt();
            if (list[i] > max) {
                max = list[i];
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
