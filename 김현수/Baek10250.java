package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10250 {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int T = 0;
//		
//		int h = 6;
//		int w = 12;
//		int n = 10;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int k=0; k<T; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int roomNumber = 0;
			
			for (int i=1; i<=w; i++) {
				for (int j=1; j<=h; j++) {
					roomNumber++;
					if (roomNumber == n) {
						if (i < 10) {
							System.out.println(j + "0" + i);
						} else {
							System.out.println(j + "" + i);
						}
						break;
					}
				}
			}
		}
	}
}
