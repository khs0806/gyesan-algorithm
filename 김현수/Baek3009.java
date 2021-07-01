package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3009 {
	public static void main(String a[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 세 점이 주어졌을 때 나머지 한점을구하시오
		int[] x = new int[4];
		int[] y = new int[4];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		x[0] = Integer.parseInt(st1.nextToken());
		y[0] = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		x[1] = Integer.parseInt(st2.nextToken());
		y[1] = Integer.parseInt(st2.nextToken());
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		x[2] = Integer.parseInt(st3.nextToken());
		y[2] = Integer.parseInt(st3.nextToken());
		
		if (x[0] == x[1]) {
			x[3] = x[2];
		} else if (x[1] == x[2]) {
			x[3] = x[0];
		} else {
			x[3] = x[1];
		}
		
		if (y[0] == y[1]) {
			y[3] = y[2];
		} else if (y[1] == y[2]){
			y[3] = y[0];
		} else {
			y[3] = y[1];
		}
		
		System.out.println(x[3] + " " + y[3]);
	}
}
