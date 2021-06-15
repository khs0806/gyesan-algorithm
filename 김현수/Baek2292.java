package programmers;

import java.util.Scanner;

public class Baek2292 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long x = 2;
		long cnt = 1;
		for (int i=1; i<n; i++) {
//			if (x == j) System.out.println("==" + j);
			if (x > n) break;
			cnt++;
			x += 6 * i;
			System.out.println(x);
		}
			
//		if (n == 1) {
//			System.out.println(1);
//		} else {
//			while(x <= n) {
//				x = x + (6*cnt++);
//			}
//			System.out.println(cnt);
//		}
		System.out.println(cnt);
	}
}
