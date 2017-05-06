/**
 * 	Verdict	 : Accepted
 * 	OJ		: Hackerrank
 * 
 * 	@author absakDev
 * 	@version June 21, 2016
 */
import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int N;
		for(int i = 1; i <= T; i++) {
			N = input.nextInt();
			String str = Integer.toString(N);
			int len = str.length();
			int count = 0;
			for(int j = 0; j < len; j++) {
				int num = Integer.parseInt(Character.toString(str.charAt(j)));
				if(num == 0) {
					continue;
				}
				if(N % num == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
