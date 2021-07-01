package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10872 {
	public static void main(String[] a) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = fact(n);
		System.out.println(answer);
	}
	
	static int fact(int n) {
		if (n == 1) return 1;
		return n * fact(n-1);
	}
}
