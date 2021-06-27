package programmers;

import java.util.Scanner;

class Baek1011 {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int distance = Y - X;
			int count = 0;
			
			int max = (int) Math.sqrt(distance); // int 타입으로 소수점 버림
			
			// 첫번째 조건
			// distance의 값의 제곱근이 정수로 딱 떨어질때
			// count의 값은 2 * max - 1 이다.
			if (max ==  Math.sqrt(distance)) {
				count = (2 * max) - 1;
			}
			
			// 두번째 조건
			// 첫번째 조건을 뺀 구간은 count가 변하는 구간을 지점으로 묶으면
			// max 값과 같다
			
			// max가 같은 값끼리 묶인 지점에 첫번째 구간
			else if (distance <= (max*max) + max) {
				count = max * 2;
			}
			
			// max가 같은 값끼리 묶인 지점에 두번째 구간
			else if ((max*max) + max <= distance) {
				count = (max * 2) + 1;
			}
			
			System.out.println(count);
		}
	}
}
