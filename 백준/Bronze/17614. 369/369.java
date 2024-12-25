import java.util.*;

public class Main {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
        
		for(int i=0; i<=n; i++) {
			int num = i;
			while(num!=0){
				if(num%10 == 3 || num%10 == 6 || num%10 == 9) {
					cnt++;
				}
                num /= 10;
			}
		}
		System.out.println(cnt);
    }
}