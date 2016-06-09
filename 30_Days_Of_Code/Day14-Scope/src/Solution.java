/**
 *  Verdict : Accepted
 *  OJ 		: Hackerrank
 *  @author absakDev 
 *  @version Juen 7, 2016
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	public Difference (int[] elements) {
  		this.elements = elements;
  		maximumDifference = Integer.MIN_VALUE;
  	}
  
  	void computeDifference () {
  		int len = elements.length;
  		for (int i = 0; i < len; i++) {
  			for (int j = i + 1; j < len; j++) {
  				int tempDiff = Math.abs(elements[i] - elements[j]);
  				if (tempDiff > maximumDifference) {
  					maximumDifference = tempDiff;
  				}
  			}
  		}
  	}

} // End of Difference Class

public class Solution {        
  	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[N];
    
    	for (int i = 0; i < N; i++) {
    		a[i] = sc.nextInt();
    	}

      	Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
   }
}
