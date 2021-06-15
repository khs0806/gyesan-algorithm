package programmers;

import java.util.Scanner;

public class Baek1193 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int T = 1;
		int prev = 0;
		
		while(true) {
			
			if (n <= prev + T) {
				if (T % 2 == 0) { // T가 홀수일 때 왼쪽에서 오른쪽으로 진행
					System.out.println((n - prev) + "/" + ((T + 1) - (n - prev)));
				} else if (T % 2 == 1) {
					System.out.println(((T + 1) - (n - prev)) + "/" + (n - prev));
				}
				break;
			}
			prev += T;
			T++;
		}
	}
}
