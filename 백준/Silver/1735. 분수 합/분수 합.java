import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1= sc.nextInt();
		int p1= sc.nextInt();
		int c2= sc.nextInt();
		int p2= sc.nextInt();
		
		c1 = (c1*p2) + (c2*p1);
		p1 = p1*p2;
        
		int gcd= getGcd(c1, p1); //최대공약수
		
		System.out.println(c1/gcd+" "+p1/gcd); 
	}
	
	static int getGcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return getGcd(b, a%b);
	}
}