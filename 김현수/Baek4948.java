package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek4948 {
	public static boolean arrays[];
	public static void main(String a[]) throws NumberFormatException, IOException {
		// 베르트랑 공준은 임의의 자연수 n 에 대하여 n보다 
		// 크고 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고있다.
		// 예) 10보다 크고 20보다 작거나 같은 소수는 4개 있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			
			isPrimeNum(2 * N);
			int cnt = 0;
			for (int i=N+1; i<arrays.length; i++) {
				
				// 소수인 경우 cnt++
				if(!arrays[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	// 에라토스테네스의 체
	static void isPrimeNum(int num) {
		arrays = new boolean[num+1];
		
		// 0, 1은 소수가 아니다.
		arrays[0] = arrays[1] = true;
		
		// 2부터 루트N까지 소수인지 판별
		for (int i=2; i<Math.sqrt(arrays.length); i++) {
			
			// i번째가 소수가 아닐 경우 패스 
			if (arrays[i]) {
				continue;
			}
			// i번째가 소수이면 자기 자신을 제외한 자기 배수의 값들은 모두 소수가 아니다.
			for (int j=i*i; j<arrays.length; j+=i) {
				arrays[j] = true;
			}
		}
	}
}
