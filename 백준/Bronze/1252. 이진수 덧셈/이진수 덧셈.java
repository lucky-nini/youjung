import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
        public static void main(String[] args){
            
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String b1 = sc.next();
            
        BigInteger A = new BigInteger(a1, 2);
        BigInteger B = new BigInteger(b1, 2);
            
        BigInteger sum = A.add(B);
        System.out.println(sum.toString(2));
    }
}