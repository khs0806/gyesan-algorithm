package programmers;

import java.util.Scanner;

public class Baek2438 {
	public static void main(String[] a) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
