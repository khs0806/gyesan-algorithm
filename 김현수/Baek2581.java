package programmers;

import java.util.Scanner;

public class Baek2581 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		// 자연수 M, N
		// M 이상 N 이하 의 자연수 중 소수만 골라 이들의 합과 최솟값을 구하시오
		
		int M,N;
		boolean first = true;
		int firstPrimeNum = 0;
		int sum = 0;
		int noPrime = -1;
		
//		M = 60;
//		N = 100;
		M = sc.nextInt();
		N = sc.nextInt();
		for (int i=M; i<=N; i++) {
			if (isPrime(i)) {
				sum += i;
				if (first) {
					firstPrimeNum = i;
					first = false;
				}
				noPrime = 0;
			}
		}
		if (noPrime == -1) {
			System.out.println(noPrime);
		} else {
			System.out.println(sum);
			System.out.println(firstPrimeNum);
		}
	}
	
	static boolean isPrime(int num) {
		
		int cnt = 0;
		for (int i=1; i<=num; i++) {
			if (num % i == 0) {
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
