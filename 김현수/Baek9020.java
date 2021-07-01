package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 골드바흐의 추측, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼수 있다
// 골드바흐 파티션, 4=2+2, 6=3+3, 8=3+5
// 2 < n <= 10000일 때 n의 골드바흐 파티션을 출력하시오
public class Baek9020 {
	
	public static boolean primeNum[];
	
	public static void main(String a[]) throws NumberFormatException, IOException {
		int num1 = 0;
		int num2 = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		makePrimeNum(10000);
		
		int T = Integer.parseInt(br.readLine());
		
//		long time1 = System.currentTimeMillis();
		
		for (int k=0; k<T; k++) {
			int N = Integer.parseInt(br.readLine());
			int p1 = N / 2;
			int p2 = N / 2;
			
			while(true) {
				if (!primeNum[p1] && !primeNum[p2]) {
					num1 = p1;
					num2 = p2;
					break;
				}
				p1--;
				p2++;
			}
			
			System.out.println(num1 + " " + num2);
		}
		
//		long time2 = System.currentTimeMillis();
//		System.out.println("걸린시간 : " + (time2 - time1) + "ms");
		
	}
	
	static void makePrimeNum(int N) {
		primeNum = new boolean[N+1];
		
		primeNum[0] = primeNum[1] = true;
		
		for (int i=2; i<Math.sqrt(primeNum.length); i++) {
			
			if (primeNum[i]) continue;
			
			for (int j=i*i; j<primeNum.length; j+=i) {
				primeNum[j] = true;
			}
		}
	}
}
