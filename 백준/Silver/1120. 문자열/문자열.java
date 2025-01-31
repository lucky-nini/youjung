import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int result = 100;
		int answer = 0;
		for(int i = 0; i <= b.length() - a.length(); i++) {
			answer = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) != b.charAt(i+j)) {
					answer++;
				}
			}
			if(answer < result)
				result = answer;
		}
        
		System.out.println(result);
		return;
	}
}
 