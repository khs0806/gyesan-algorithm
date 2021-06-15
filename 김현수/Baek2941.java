package programmers;

import java.util.Scanner;

public class Baek2941 {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
//		String cro = "ddz=z=";
		String cro = sc.nextLine();
		int cnt = 0;
		
		for (int i=0; i<cro.length(); i++) {
			if (i < cro.length() - 1 && cro.charAt(i) == 'c' && (cro.charAt(i+1) == '=' || cro.charAt(i+1) == '-')) {
				i++;
			} else if (i < cro.length() - 1 && cro.charAt(i) == 'd' && cro.charAt(i+1) == '-') {
				i++;
			} else if (i < cro.length() - 2 && cro.charAt(i) == 'd' && cro.charAt(i+1) == 'z' && cro.charAt(i+2) == '=') {
				i++;
				i++;
			} else if (i < cro.length() - 1 && cro.charAt(i) == 'l' && cro.charAt(i+1) == 'j') {
				i++;
			} else if (i < cro.length() - 1 && cro.charAt(i) == 'n' && cro.charAt(i+1) == 'j') {
				i++;
			} else if (i < cro.length() - 1 && cro.charAt(i) == 's' && cro.charAt(i+1) == '=') {
				i++;
			} else if (i < cro.length() - 1 && cro.charAt(i) == 'z' && cro.charAt(i+1) == '=') {
				i++;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
