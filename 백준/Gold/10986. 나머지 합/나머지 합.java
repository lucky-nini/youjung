import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(); 
        int[] arr = new int[n];
        int[] newArr = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = (sum + arr[i])%m;
            if (sum == 0) {
                count++; 
            }
            newArr[sum]++;
        }

        for (int i = 0; i < m; i++) {
            if (newArr[i] >1) {
                count += (long)newArr[i] * (newArr[i] - 1) / 2;
            }
        }

        System.out.println(count);
    }
}
