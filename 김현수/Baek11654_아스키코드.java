package programmers;

import java.util.Scanner;

public class Baek11654 {
	// 알파벳 소문자,대문자,숫자0-9 중 하나가 주어졌을 때 주어진 글자의 아스키 코드 반환하기
	public static void main(String[] a) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char ascii = n.charAt(0);
		
		System.out.println((int) ascii);
	}
	
}
