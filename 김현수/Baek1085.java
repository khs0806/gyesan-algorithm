package programmers;

import java.util.Scanner;

public class Baek1085 {
	// 한수는 지금 x, y에 있다.
	// 직사각형 왼쪽 아래 꼭짓점은 0, 0에 있고
	// 오른쪽 위 꼭짓점은 w, h에 있다.
	// 한수가 직사각형 경계선 까지 가는거리의 최솟값을 구하시오.
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
//		int x = 6;
//		int y = 2;
//		int w = 10;
//		int h = 3;
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		if ((w - x) > (h - y)) {
			if ((h - y) > x) {
				if (x > y) {
					System.out.println(y);
				} else {
					System.out.println(x);
				}
			} else if ((h - y) > y){
				if (x > y) {
					System.out.println(y);
				} else {
					System.out.println(x);
				}
			} else {
				System.out.println(h - y);
			}
		} else {
			if ((w - x) > x) {
				if (x > y) {
					System.out.println(y);
				} else {
					System.out.println(x);
				}
			} else if ((w - x) > y){
				if (x > y) {
					System.out.println(y);
				} else {
					System.out.println(x);
				}
			} else {
				System.out.println(w - x);
			}
		}
	}
}
