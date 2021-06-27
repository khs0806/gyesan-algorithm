package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek11653 {
	public static void main(String a[]) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		// 정수 N이 주어졌을때 소인수분해 하시오
//		int N;
////		N = 9999999;
//		N = sc.nextInt();
////		long time1 = System.currentTimeMillis();
//		for (int i=1; i<=N; i++) {
//			if (N % i == 0) {
//				if (isPrimeNum(i)) {
//					System.out.println(i);
//					N = N / i ;
//					i = 1;
//				}
//			}
//		}
		
//		long time2 = System.currentTimeMillis();
//		System.out.println("time : " + (time2 - time1));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long time1 = System.currentTimeMillis();
		
		for(int i=2; i*i<=N; i++){
			while(N%i == 0){
				System.out.println(i);
				N  = N / i;
			}
		}
		
		if(N>1){
			System.out.println(N);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("time : " + (time2 - time1));
	}
	
	static boolean isPrimeNum(int num) {
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
