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
		String S, R;
		StringBuilder inputString, reversedString;
		for(int i = 1; i <= T; i++) {
			S = input.next();
			inputString = new StringBuilder(S);
			reversedString = inputString.reverse();
			R = reversedString.toString();
			int len = S.length();
			char arrS[] = S.toCharArray();
			char arrR[] = R.toCharArray();
			boolean funny = true;
			for(int j = 1; j < len; j++) {
				//System.out.println(arrS[j] + " "+ arrS[j-1] + " " +arrR[j] + " " + arrR[j-1]);
				if((int)Math.abs(arrS[j] - arrS[j-1]) != (int)Math.abs(arrR[j] - arrR[j-1])) {
					funny = false;
					break;
				}
			}
			if(funny) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
	}

}
