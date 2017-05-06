/**
 *  Verdict : Accepted
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean possible = false;
        
        int count1 = x1;
        int count2 = x2;
        while(count1 <= 1000 && count2 <= 1000) {
        	if(count1 == count2) {
        		possible = true;
        		break;
        	} else {
        		count1 += v1;
        		count2 += v2;
        	}
        }
        if(possible) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }
}
