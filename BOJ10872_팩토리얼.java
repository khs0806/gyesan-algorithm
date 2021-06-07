package programmers;

import java.util.Scanner;

public class Baek10872 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = 1;
		
		// 반복문ver
		if (N % 2 == 0) {
			for(int i=N; i>0; i--) {
				tmp = tmp * i;
			}
		} else {
			tmp = facto(N);
		}
		
		System.out.println(tmp);
		
	}
	
	//재귀함수ver
	static int facto(int n) {
		if(n < 1) return 1;
		return n * facto(n-1);
	}
	
}
