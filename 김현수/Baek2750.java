package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek2750 {
	// N개의 수가 주어졌을 때 이를 오름차순으로 정렬
	public static void main(String a[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());;
		}
		
		int tmp=0;
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
