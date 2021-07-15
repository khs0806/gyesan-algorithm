package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek1018 {
	// 정사각형 여러개로 이루어진 M*N 크기의 보드에서
	// 정사각형은 검은색 또는 흰색으로 이루어져있고
	// 무분별하게 칠해져있는 색깔을 8 * 8 의 체스판을 만드려고 한다.
	// 체스판은 검은색 흰색 번갈아며 칠해져 있어야 한다.
	// M * N 의 크기가 주어졌을 때 다시 칠해야 되는 정사각형의 최소 개수를 구하시오.
	
	// 입력
	//	8 8
	//	WBWBWBWB
	//	BWBWBWBW
	//	WBWBWBWB
	//	BWBBBWBW
	//	WBWBWBWB
	//	BWBWBWBW
	//	WBWBWBWB
	//	BWBWBWBW
	
	// 출력
	// 1
	
	// 입력
	//	10 13
	//	BBBBBBBBWBWBW
	//	BBBBBBBBBWBWB
	//	BBBBBBBBWBWBW
	//	BBBBBBBBBWBWB
	//	BBBBBBBBWBWBW
	//	BBBBBBBBBWBWB
	//	BBBBBBBBWBWBW
	//	BBBBBBBBBWBWB
	//	WWWWWWWWWWBWB
	//	WWWWWWWWWWBWB
	
	// 출력
	// 12
	public static boolean arr[][];
	public static int min = 64;
	
	public static void main(String a[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		arr = new boolean[N][M];
		String[] split;
//		System.out.println("arr.length : "+arr.length);
		for (int i=0; i<arr.length; i++) {
			split = br.readLine().split("");
//			System.out.println("arr["+i+"].length : "+arr[i].length);
			for (int j=0; j<arr[i].length; j++) {
				if (split[j].equals("W")) {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int N_row = N - 7;
		int M_col = M - 7;
		
		for (int i=0; i<N_row; i++) {
			for (int j=0; j<M_col; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}
	
	static void find(int x, int y) {
		int cnt = 0; 
		
		boolean first = arr[x][y];
		
		for (int i=x; i<x+8; i++) {
			for (int j=y; j<y+8; j++) {
				if (arr[i][j] != first) cnt++;
				first = !first;
			}
			first = !first;
		}
		
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}
}
