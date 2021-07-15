package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek1436 {
	// 첫번째 영화는 666
	// 두번째는 1666 세번째는 2666 ...
	
	public static void main(String a[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = 0;
		int cnt = 0;
		while (true) {
			num++;
			String ext = Integer.toString(num);
			
			if (ext.contains("666")) cnt++;
			if (N == cnt) break;
		}
		System.out.println(num);
	}
}
