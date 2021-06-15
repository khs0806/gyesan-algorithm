package programmers;

import java.util.Scanner;

public class Baek2908 {
	// 두 수가 주어졌을때, 두 수의 크기를 비교하라.
	// 단, 두 수를 뒤집어서 읽었을 때의 크기를 비교해야 한다.
	// 예) 734 와 893 을 비교하면, 437 과 398로 비교한다.
	// 두 수 중 큰 숫자를 출력 ( 437로 출력 )
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] num =n.split(" ");
		String[] sangsu = new String[3];
		int[] vs = new int[2];
		
		for (int i=0; i<num.length; i++) {
			int cnt = 0;
			String[] arr = num[i].split("");
			for (int j=arr.length-1; j>=0; j--) {
				sangsu[cnt++] = arr[j];
			}
			String hap = String.join("", sangsu);
			vs[i] = Integer.parseInt(hap);
		}
		
		if (vs[0] < vs[1]) {
			System.out.println(vs[1]);
		} else {
			System.out.println(vs[0]);
		}
	}
}
