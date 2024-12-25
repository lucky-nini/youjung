import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for(int j = 0; j < T; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int r = 1;
			
			for (int i=0;i<b;i++)r=(r*a)%10;
			if(r==0) r=10;
			System.out.println(r);
		}
	}
}