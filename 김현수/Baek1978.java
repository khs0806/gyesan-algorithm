package programmers;

import java.util.Scanner;

public class Baek1978 {
	public static void main(String[] a) {
		// 주어진 N개의 자연수 중 소수의 개수를 구하여라
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for (int i=0; i<N; i++) {
//			System.out.println(sc.nextInt());
			int primeNum = sc.nextInt();
			if (isPrimeNum( primeNum )) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static boolean isPrimeNum(int primeNum) {
		int cnt = 0;
		for (int i=1; i<=primeNum; i++) {
			if (primeNum % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) {
			return true;
		} else {
			return false;
		}
	}
}
