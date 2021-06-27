package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2775 {
	public static void main(String[] a) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] people = new int[15][15];
		
		for (int i=0; i<T; i++) {
			int floor = Integer.parseInt(br.readLine());
			int roomNumber = Integer.parseInt(br.readLine());
			
			for (int j=0; j<=floor; j++) {
				if (j < 1) {
					for (int k=0; k<15; k++) {
						people[k][1] = 1;
						people[0][k] = k;
					}
					
				} else {
					for (int k=2; k<15; k++) {
						people[j][k] = people[j][k-1] + people[j-1][k]; 
					}
				}
			}
			System.out.println(people[floor][roomNumber]);
		}
	}
}
