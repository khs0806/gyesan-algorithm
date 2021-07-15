package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak7568 {
	// 덩치 순위를 구하라
	// 1. 키와 몸무게를 비교하여 둘다 높은 사람이 덩치가 더크다.
	// 2. x,y x는 몸무게 y는 키
	// 입력 첫째줄에 인원 수 n
	// 그다음줄부터 몸무게와키
	
	// 입력
	//  5
	//  55 185
	//	58 183
	//	88 186
	//	60 175
	//	46 155
	
	// 출력
	// 2 2 1 2 5
	public static void main(String a[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] big = new int[N][2];
		
		for (int i=0; i<big.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			big[i][0] = Integer.parseInt(st.nextToken());
			big[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<N; i++) {
//			System.out.print(big[i][0]);
//			System.out.println(big[i][1]);
			int rank = 1;
			for (int j=0; j<N; j++) {
				if (i == j) continue;
				if (big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
	}
}
