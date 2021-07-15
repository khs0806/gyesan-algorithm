package programmers;

import java.util.Scanner;

public class Baek2231 {
	// 1. 숫자 자리 수마다 최저 값이 있다
	// ex) 3자리면 9 + 9 + 9가 최대 값이므로 27이하이면 값이 성립할 수 없지.
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
//		String n = "216";
		String n = sc.nextLine();
		
		int construct = Integer.parseInt(n);
		int dig = n.length();
		int repeat = construct - (dig*9);
		boolean noConstruct = true;
		
		if (dig == 1) {
			repeat = 1;
		} else if (dig == 2) {
			repeat = 10;
		}
		
		for (int i=repeat; i<construct; i++) {
			String hap = String.valueOf(i);
			int num = i;
			for (String at : hap.split("")) {
				num += Integer.parseInt(at);
			}
			if (construct == num) {
				System.out.println(i);
				noConstruct = false;
				break;
			}
		}
		if (noConstruct) System.out.println(0);
	}
}
