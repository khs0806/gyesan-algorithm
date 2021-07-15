package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek11729 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String a[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		sb.append((int) (Math.pow(2, N) - 1)).append("\n");
		hanoi(N, 1, 2, 3);
		System.out.println(sb);
		
	}
	
	static void hanoi(int N, int from, int mid, int to) {
		if (N == 1) {
//			System.out.println(from +" "+ to);
			sb.append(from +" "+ to).append("\n");
			return;
		}
		
//		System.out.println("hanoi("+(N-1)+","+from+","+to+","+mid+")");
		hanoi(N-1, from, to, mid);
		
//		sysout은 시간초과가 걸린다.
//		System.out.println(from +" "+ to);
		sb.append(from +" "+ to).append("\n");
		
//		System.out.println("hanoi("+(N-1)+","+mid+","+from+","+to+")");
		hanoi(N-1, mid, from, to);
	}
}
