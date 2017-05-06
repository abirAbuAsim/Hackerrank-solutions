import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> stack3 = new Stack<Integer>();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1 += h1[h1_i];
            stack1.add(h1[h1_i]);
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2 += h2[h2_i];
            stack2.add(h2[h2_i]);
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3 += h3[h3_i];
            stack3.add(h3[h3_i]);
        }
        int limit = Integer.MAX_VALUE;
        boolean flag = true;
        while(true) {
        	int temp1, temp2, temp3;
        	if(flag) {
        		temp1 = stack1.pop();
            	sum1 -= temp1;
            	limit = sum1;
            	continue;
        	}
        	if(sum1 > limit) {
        		temp1 = stack1.pop();
            	sum1 -= temp1;
        	}
        }
        
    }
}
