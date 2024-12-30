import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		int left = 0;	
		int right = 0;
		int len = (Integer.toString(N).length()) / 2;	
        
		while(N != 0) {
			if(len > 0) {
				right += (N%10);
				N /= 10;
				len --;
			}
			else {
				left += (N%10);
				N /= 10;
			}
		}
		
		if(left == right){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }
	}
}