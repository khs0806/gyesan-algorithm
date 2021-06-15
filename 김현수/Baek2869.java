package programmers;

import java.util.Scanner;

public class Baek2869 {
	// v미터 높이의 나무가 있다.
	// 낮동안 a미터 올라가고 밤에 b만큼 떨어지는 달팽이가
	// 며칠만에 나무 정상에 도착하는지 구하기
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		// 변수구하기.
		// 낮동안올라가는 높이(A), 밤동안 떨어지는 높이(B), 나무높이(v), 달팽이 위치(h), 도달한 날짜(days)
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int v = sc.nextInt();
//		int h = 0;
//		int days = 1;
//		
//		// 목표치 높이까지 반복
//		while(true) {
//			h += A;
//			// 목표치 높이 이상 도달하면 
//			if (h >= v) {
//				System.out.println(days);
//				break;
//			}
//			h -= B;
//			days++;
//		}
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int v = sc.nextInt();
		
		int days = (v - B) / (A - B);
//		System.out.println((v - B) / (A - B));
		
		if ((v - B) % (A - B) != 0) {
			days++;
		}
		System.out.println(days);
	}
}
