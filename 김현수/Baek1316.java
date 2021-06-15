package programmers;

import java.util.Scanner;

public class Baek1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = "aaaa";
		int n = sc.nextInt();
		int cnt = 0;
		sc.nextLine();
		for (int i=0; i<n; i++) {
			String str = sc.nextLine();
			if(checker(str)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
	static boolean checker(String str) {
		boolean[] idx = new boolean[26];
		int prev = -1;
		
		// String 타입으로 받은 문자열을 하나씩 탐색
		for (int i=0; i<str.length(); i++) {
			int index = str.charAt(i) - 97;
			if (prev != index) {
				if (!idx[index]) {
					idx[index] = true;
				} else {
					return false;
				}
				prev = index;
			}
		}
		return true;
	}
	
}
