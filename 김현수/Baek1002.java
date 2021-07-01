package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1002 {
	public static void main(String a[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// 두 점에서 만나는 경우
		// d < r1 + r2
		// r1 - r2 < d
		// 한 점에서 만나는 경우
		// 외접 : r1 + r2 == d
		// 내접 : r1 - r2 == d
		// 만나지 않는 경우
		// r1 + r2 < d
		// r1 - r2 > d
		// d = 0, r1 != r2
		// 일치하는 경우
		// d = 0, r1 == r2
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			// 두 중심점 사이의 거리
			double d = Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2);
			if (d == 0) {
				if (r1 == r2) {
					System.out.println("-1");
				} else {
					System.out.println("0");
				}
			} else {
				if (Math.pow(r1 + r2,2) > d && Math.pow(r1 - r2,2) < d) {
					System.out.println("2");
				} else if (Math.pow(r1 + r2,2) == d) {
					System.out.println("1");
				} else if (Math.pow(r2 - r1,2) == d) {
					System.out.println("1");
				} else if (Math.pow(r1 + r2,2) < d) {
					System.out.println("0");
				} else if (Math.pow(r2 - r1,2) > d) {
					System.out.println("0");
				}
			}
		}
	}
}
