/**
 * 	Verdict	: Accepted
 * 	OJ		: Hackerrank
 * 
 * 	@author : absak
 * 	@version: June 9, 2016
 * 
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	String str = input.next();
    	try{
    		int num = Integer.parseInt(str);
    		System.out.println(num);
    	} catch(Exception e){
    		System.out.println("Bad String");
    	}
    }
}