package programmers;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Beak10757 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		BigInteger bigNum1 = new BigInteger(st.nextToken());
		BigInteger bigNum2 = new BigInteger(st.nextToken());
		
		// 덧셈
		System.out.println(bigNum1.add(bigNum2));
		
	}
}
