package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2675 {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String x = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int z = Integer.parseInt(st.nextToken());
				String str = st.nextToken();
				for (int j=0; j<str.length(); j++) {
					for (int d=0; d<z; d++) {
						System.out.print(str.charAt(j));
					}
				}
				System.out.println();
			}
		}
	}
}
