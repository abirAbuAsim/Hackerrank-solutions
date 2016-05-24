import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int k = input.nextInt();
    	int a[] = new int[n + 1];
    	int aNew[] = new int[n+1];
    	for (int a_i = 0; a_i < n; a_i++) {
    		a[a_i] = input.nextInt();
    	}
    	int lastIndex = a.length - 1;
    	for (int I = 0; I <= lastIndex; I++) {
    		int count = 0;
    		for (int J = 0; J <= lastIndex; J++) {
    			if (I == J) {
    				continue;
    			}
    			if ((a[I] + a[J]) % k == 0) {
    				count++;
    			}
    		}
    		if (count == (lastIndex - 1)){
    			aNew[I] = -1;
    		} else {
    			aNew[I] = a[I];
    		}
    	}
    	Set<Integer> sPrime = new HashSet<Integer>();
    	for (int a_i = 0; a_i < n; a_i++) {
    		if (aNew[a_i] != -1) {
    			sPrime.add(aNew[a_i]);
    		}
    	}
    	System.out.println(sPrime.size());
    	
    }
}