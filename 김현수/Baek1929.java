package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1929 {
	public static boolean[] prime;
	public static void main(String a[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// M이상 N이하 소수를 모두 출력
		int M,N;
//		M = 3;
//		N = 16;
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		
		long time1 = System.currentTimeMillis();
		for (int i=M; i<=N; i++) {
			if (isPrimeNum(i)) {
//				System.out.println(i);
			}
		}
		long time2 = System.currentTimeMillis();
		System.out.println("일반ver 걸린시간 : " + (time2 - time1) + "ms");
		
		long time3 = System.currentTimeMillis();
		make_prime(N);
		for (int i=M; i<prime.length; i++) {
			if (prime[i] == false) {
//				System.out.println(i);
			}
		}
		long time4 = System.currentTimeMillis();
		System.out.println("아레토스테네스의 체ver 걸린시간 : " + (time4 - time3)+ "ms");
		
	}
	
	static boolean isPrimeNum(int num) {
		
		// 0, 1 은 소수가 아니다
		if (num < 2) {
			return false;
		}
		// 2는 소수다
		if (num == 2) {
			return true;
		}
		
		for(int i=2; i*i<=num; i++) {
			// 소수가 아니라면 나누어 떨어진다.
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	// N 이하 소수 생성 메소드
	// 아레토스테네스의 체
	public static void make_prime(int N) {
		
		prime = new boolean[N + 1];	// 0 ~ N
 
		/*
		소수가 아닌 index = true
		소수인 index = false
		*/
		
		// 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
		if(N < 2) {
			return;
		}
        
		prime[0] = prime[1] = true;
		
        
		// 제곱근 함수 : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(N); i++) {
        
			// 이미 체크된 배열이면 다음 반복문으로 skip
			if(prime[i]==true) {
				continue;
			}
        
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i*i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
 
	}
}
