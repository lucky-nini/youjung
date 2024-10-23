import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0; // 그룹 단어 개수

        for (int i = 0; i < N; i++) {
            String S = sc.next();
            boolean check[] = new boolean[26]; // 알파벳
            boolean group = true; // 그룹 단어

            for (int j = 0; j < S.length(); j++) {
                int index = S.charAt(j) - 'a';
                if(check[index]) {//사용한적 있어 
                    if(S.charAt(j) != S.charAt(j-1)) { // 이전 문자와 연속X
                        group = false; 
                        break;
                    }
                }else { //사용한적 없어 
                    check[index] = true; // 문자 사용 체크
                }
            }
            if(group) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}