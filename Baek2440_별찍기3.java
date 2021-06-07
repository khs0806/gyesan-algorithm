package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2440 {
	public static void main(String[] a) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i<N; i++) {
			for (int j=i; j<N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
