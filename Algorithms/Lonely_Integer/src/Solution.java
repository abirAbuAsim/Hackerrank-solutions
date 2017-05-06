/**
 * 	Verdict	 : Accepted
 * 	OJ		: Hackerrank
 * 
 * 	@author absakDev
 * 	@version June 21, 2016
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     private static int lonelyInteger(int[] a) {
    	int size_a = a.length;
    	int lonelyInt = 0;
    	int pairCount[] = new int[101];
    	for(int i = 0; i < size_a; i++) {
    		pairCount[a[i]]++;
    	}
    	for(int i = 0; i <= 100; i++) {
    		if(pairCount[i] == 1) {
    			lonelyInt = i;
    		}
    	}
        return lonelyInt;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
