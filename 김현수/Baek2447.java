package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baek2447 {
	// n은 3의 거듭제곱이다
	// 크기 n의 패턴은 n*n의 정사각형 모양이다.
	// 크기 3의 패턴
	// ***
	// * *
	// ***
	// 크기 9의 패턴
	//		*********
	//		* ** ** *
	//		*********
	//		***   ***
	//		* *   * *
	//		***   ***
	//		*********
	//		* ** ** *
	//		*********
	static char[][] arr;
	
	public static void main(String a[]) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(br.readLine());
		int N = sc.nextInt();
		arr = new char[N][N];
		StringBuilder sb = new StringBuilder();
		
		makeStar(0, 0, N, false);
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
//				System.out.print(arr[i][j]); 시간초과
				sb.append(arr[i][j]);
			}
//			System.out.println();
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static void makeStar(int x, int y, int N, boolean blank) {
		
		// 공백칸일 경우
		if (blank) {
			for (int i=x; i<x+N; i++) {
				for (int j=y; j<y+N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// 더 이상 쪼갤수 없는 블럭일때
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		/*
		 * N = 27 일 경우 한 블록의 사이즈는 9
		 * N = 9 일 경우 한 블록의 사이즈는 3 이므로
		 * 사이즈는 N/3
		 * count는 별 출력 누적 합
		 */
		
		int size = N/3;
		int cnt = 0;
		boolean isBlank = true;
		for (int i=x; i<x+N; i+=size) {
			for (int j=y; j<y+N; j+=size) {
				cnt++;
				if (cnt==5) {
					makeStar(i, j, size, isBlank);
				} else {
					makeStar(i, j, size, !isBlank);
				}
			}
		}
	}
}
