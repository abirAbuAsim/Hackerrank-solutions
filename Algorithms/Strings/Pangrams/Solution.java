/**
 * 	Verdict : 
 * 	OJ 		: Hackerrank
 * 
 * 	@author: absakDev
 * 	@version: 30/5/2016
 * 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	String s = input.nextLine();
    	int lengthOfS = s.length();
    	Set<Character> alphaSet = new HashSet<Character>();
    	for (int I = 0; I < lengthOfS; I++) {
    		char tempChar = Character.toLowerCase(s.charAt(I));
    		if (Character.isAlphabetic(tempChar)) {
    			alphaSet.add(tempChar);
    		}
    	}
    	if (alphaSet.size() == 26) {
    		System.out.println("pangram");
    	} else {
    		System.out.println("not pangram");
    	}
    }
}