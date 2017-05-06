/**
 * 	Verdict : Accepted
 * 	OJ		: Hackerrank
 * 	
 * 	@author absakDev
 * 	@version June 20, 2016
 */
import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int x[] = new int[T + 1];
		int y[] = new int[T+1];
		for(int i = 1; i <= T; i++) {
			x[i] = input.nextInt();
			y[i] = input.nextInt();
		}
		int xCount = 0;
		int yCount = 0;
		for(int i = 2; i <= T; i++) {
			if(x[i] == x[i-1]) {
				xCount++;
			}
			if(y[i] == y[i-1]) {
				yCount++;
			}
		}
		if(xCount == (T-1) || yCount == (T-1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
