package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek4153 {
	public static void main(String a[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x,y,z;
		
		while(true) {
			String axis[] = br.readLine().split(" ");
			x = Integer.parseInt(axis[0]);
			y = Integer.parseInt(axis[1]);
			z = Integer.parseInt(axis[2]);
			int tmp = 0;
			
			if (x > z || y > z) {
				if (x > y) {
					tmp = z;
					z = x;
					x = tmp;
				} else if (y > x) {
					tmp = z;
					z = y;
					y = tmp;
				}
			}
			
			if ((x == 0)&&(y == 0)&&(z == 0)) {
				break;
			} else {
				if ((x * x) + (y * y) == (z * z)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
		}
	}
}
