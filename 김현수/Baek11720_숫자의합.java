package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek11720 {
	// n개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 만드세요.
	public static void main(String[] a) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		String str = sc.nextLine();
		String[] arr = str.split("");
		int sum = 0;
		
		for (int i=0; i<Integer.parseInt(n); i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
	
}
