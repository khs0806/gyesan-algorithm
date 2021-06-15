package programmers;

import java.util.Scanner;

public class Baek5622 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
//		String dial = "UNUCIC";
		String dial = sc.nextLine();
		int cnt = 0;
		for (int i=0; i<dial.length(); i++) {
			int n = dial.charAt(i) - 65;
			if (0 <= n && 3 > n) {
				cnt += 3;
			} else if (3 <= n && 6 > n) {
				cnt += 4;
			} else if (6 <= n && 9 > n) {
				cnt += 5;
			} else if (9 <= n && 12 > n) {
				cnt += 6;
			} else if (12 <= n && 15 > n) {
				cnt += 7;
			} else if (15 <= n && 19 > n) {
				cnt += 8;
			} else if (19 <= n && 22 > n) {
				cnt += 9;
			} else if (22 <= n && 26 > n) {
				cnt += 10;
			}
		}
		System.out.println(cnt);
	}
}
