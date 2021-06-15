package programmers;

import java.util.Scanner;

public class Baek1152 {
	// 영어 대소문자, 띄어쓰기로만 이루어진 문자열.
	// 이 문자열에는 몇개의 단어가 있을까?
	// 단, 같은 단어가 등장할 경우 횟수도 카운트한다.
	// 공백을 기준으로 단어를 구분하며, 연속해서 공백이 나오는경우는 없고
	// 문자열 앞과뒤에는 공백이 있을 수 있다.
	public static void main(String[] a) {
		//String word = " The Curious Case of Benjamin Button";
		String word = new Scanner(System.in).nextLine();
		String[] arr = word.split(" ");
		int empty = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i].length() == 0) empty++;
		}
		
		if (empty > 0) {
			System.out.println(arr.length - 1);
		} else {
			System.out.println(arr.length);
		}
	}
}
