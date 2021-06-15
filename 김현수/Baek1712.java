package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek1712 {
	// 고정비용 A만원
	// 한대생산비용 B만원
	// 노트북 가격 C만원
	// A, B, C가 입력 됬을때 손익분기점 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		sc.close();
		
		if (C<=B) {
			System.out.println("-1");
		} else {
			System.out.println((A / (C-B)) + 1);
		}
	}
}
