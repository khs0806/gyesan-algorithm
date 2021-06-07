package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[9];
		int max = 0;
		int idx = 0;
		for (int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
			if (max < array[i]) {
				max = array[i];
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);
		
	}
}
