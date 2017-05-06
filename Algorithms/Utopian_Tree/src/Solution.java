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
			int treeGrowth = 1;
			for(int j = 1; j <= N; j++) {
				if(j % 2 == 1) {
					treeGrowth *= 2;
				} else if(j % 2 == 0) {
					treeGrowth++;
				}
			}
			System.out.println(treeGrowth);
		}
	}
}
