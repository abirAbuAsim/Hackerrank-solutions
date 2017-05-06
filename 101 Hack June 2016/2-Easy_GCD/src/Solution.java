/**
 * 	Verdict : Solved
 * 	OJ		: Hackerrank
 * 	
 * 	@author absakDev
 * 	@version June 20, 2016
 */
import java.util.*;
import java.io.*;
public class Solution {
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, k;
		n = input.nextInt();
		k = input.nextInt();
		int a[] = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			a[i] = input.nextInt();
		}
		int x = Integer.MAX_VALUE;
		for(int i = 2; i <= n; i++) {
			int temp = gcd(a[i], a[i - 1]);
			if(temp < x) {
				x = temp;
			}
			//System.out.println(temp);
		}
		int l = 0;
		for(int i = k; i >= 0; i--) {
			if(i % x == 0) {
				l = i;
				break;
			}
		}
		System.out.println(l);
	}
}
