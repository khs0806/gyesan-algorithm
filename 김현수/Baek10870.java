package programmers;

import java.util.Scanner;

public class Baek10870 {
	public static void main(String a[]) {
		int n = new Scanner(System.in).nextInt();
		int answer = fibo(n);
		System.out.println(answer);
	}
	
	static int fibo(int n) {
		
		if (n == 1) return 1;
		if (n == 0) return 0;
		
		return fibo(n-1) + fibo(n-2);
	}
}
