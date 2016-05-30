/**
 * 	Verdict: Accepted
 * 	OJ		: Hackerrank
 * 
 * 	@author: absakDev
 * 	@version: 30/5/2016
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int onArrivalCount, lateArrivalCount;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            onArrivalCount = 0;
            lateArrivalCount = 0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i] <= 0) {
                	onArrivalCount++;
                } else {
                	lateArrivalCount++;
                }
            }
            if (onArrivalCount >= k) {
            	System.out.println("NO");
            } else {
            	System.out.println("YES");
            }
        }
    }
}
