/**
 * 	Verdict	: Accepted
 * 	OJ		: Hackerrank
 * 
 * 	@author absakDev
 *	@version June 11, 2016
 */
import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n + 1];
		int totalSwaps = 0;
		for(int i = 0; i < n; i++){
			a[i] = input.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - 1; j++){
				if(a[j] > a[j + 1]){
					int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    totalSwaps++;
				}
			}
		}
		System.out.format("Array is sorted in %d swaps.\n", totalSwaps);
		System.out.format("First Element: %d\n", a[0]);
		System.out.format("Last Element: %d\n", a[n-1]);
	}
}
