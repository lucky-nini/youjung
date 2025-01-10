import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String text;

        text = sc.nextLine();
        if (!text.equals("고무오리 디버깅 시작")) {
            return;
        }

        while (true) {
            text = sc.nextLine();

            if (text.equals("고무오리 디버깅 끝")) {
                break;
            }

            if (text.equals("문제")) {
                count++;
            } else if (text.equals("고무오리")) {
                if (count == 0) {
                    count += 2;
                } else {
                    count--;
                }
            }
        }

        if (count == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
    }
}
