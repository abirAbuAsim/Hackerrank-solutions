/**
 *  Verdict : Accepted
 *  
 *  
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int minDistance = Integer.MAX_VALUE;
        int tempDistance;
        boolean found = false;
        for(int i = 0; i < n; i++) {
        	if(A[i] != -1) {
        		for(int j = i+1; j < n; j++) {
        			if(A[i] == A[j]) {
        				found = true;
        				tempDistance = (int)Math.abs(i-j);
        				if(tempDistance < minDistance){
        					minDistance = tempDistance;
        				}
        			}
        		}
        	}
        }
        if(found){
            System.out.println(minDistance);
        } else {
        	System.out.println(-1);
        }
        
    }
}
