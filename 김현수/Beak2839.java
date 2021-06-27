package programmers;

import java.util.Scanner;

public class Beak2839 {
	// N 킬로그램의 설탕이 있다.
	// 5킬로그램, 3킬로그램의 봉투가 있고 N킬로그램의 설탕을 옮길때
	// 가장 적은 갯수의 봉투를 사용하여 옮기는 프로그램 작성
	// 단, 각 봉투의 무게수를 맟춰 담아야 한다.
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		int result5 = 0;
		int result3 = 0;
		
		int d = N / 5;
		
		if (N < 5) {
			if (N == 3) {
				System.out.println("1");
				return;
			} else {
				System.out.println("-1");
				return;
			}
		}
		
		for (int i=d; i>=1; i--) {
			a = i * 5;
			b = N - a;
			c = b % 3;
			if (c == 0) {
				result5 = i;
				result3 = b / 3;
				break;
			}
		}
		
		if (c != 0) {
			if (N % 3 == 0) {
				System.out.println(N / 3);
			} else {
				System.out.println("-1");
			}
		} else {
			System.out.println(result5 + result3);
		}
	}
}
