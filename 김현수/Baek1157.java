package programmers;

import java.util.Scanner;

public class Baek1157 {
	// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어지면
	// 이 단어에서 가장 많이 쓰인 알파벳 알아내기
	// 단, 대소문자 구별은 하지 않는다.
	// 단, 가장 많이 쓰인 알파벳이 2개 이상인 경우 '?' 로 출력
	public static void main(String[] a) {
//		String alpha = "Mississipi";
		String alpha = new Scanner(System.in).nextLine();
		int[] idx = new int[26];
		
		// 아스키 코드를 이용 a - 97, A - 65
		// 각 알파벳을 인덱스화 시켜서 인덱스를 
		// 카운팅하여 가장 높은 인덱스를 추출
		// 
		for (int i=0; i<alpha.length(); i++) {
			if (alpha.charAt(i) < 91) {
				int index = alpha.charAt(i) - 65;
				idx[index] += 1;
			} else if (alpha.charAt(i) > 96) {
				int index = alpha.charAt(i) - 97;
				idx[index] += 1;
			}
		}
		
		// 가장 많이 쓰인 알파벳 구하기
		int max = 0;
		int maxIdx = 0;
		for (int i=0; i<26; i++) {
			if (max < idx[i]) {
				max = idx[i];
				maxIdx = i;
			}
		}
		
		// 가장 많이쓰인 알파벳이 2개 이상 인 것이 있나 구분하기위해 정렬
		for (int i=0; i<idx.length; i++) {
			for (int j=0; j<idx.length; j++) {
				if (idx[i] < idx[j]) {
					int tmp = idx[i];
					idx[i] = idx[j];
					idx[j] = tmp;
				}
			}
		}
		
		if (idx[idx.length - 1] == idx[idx.length - 2]) {
			System.out.println("?");
		} else {
			System.out.println((char) (maxIdx + 65));
		}
	}
}
