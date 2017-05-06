import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N, K;
    	N = input.nextInt();
    	K = input.nextInt();
    	int L[] = new int[N + 1];
    	int T[] = new int[N + 1];
    	int minL = Integer.MAX_VALUE;
    	for(int i = 0; i < N; i++) {
    		L[i] = input.nextInt();
    		T[i] = input.nextInt();
    		//System.out.println(L[i] + " : " + T[i]);
    		if(L[i] < minL) {
    			//System.out.println("hoh");
    			minL = L[i];
    			//System.out.println(minL);
    		}
    	}
    	int sum = 0;
    	int lost = 0;
    	for(int i = 0; i < N; i++) {
    		if(L[i] == minL && T[i] == 1 && lost <= K) {
    			lost++;
    			sum -= L[i];
    			continue;
    		}
    		sum += L[i];
    	}
    	System.out.println(sum);
    }
}