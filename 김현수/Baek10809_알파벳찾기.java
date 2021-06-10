package programmers;

import java.util.Scanner;

public class Baek10809 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] alpha = new int[26];
		int idx = 0;
		
		for (int i=0; i<str.length(); i++) {
			idx = (int) str.charAt(i) - 97;
			if (alpha[idx] == 0) alpha[idx] = i + 1;
		}
		
		for (int i=0; i<alpha.length; i++) {
			System.out.print((alpha[i] - 1) + " ");
		}
	}
}
