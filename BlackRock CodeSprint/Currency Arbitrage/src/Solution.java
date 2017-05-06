/**
 * 	Verdict	:	Accepted
 * 	OJ		:	Hackerrank
 * 
 * 	@author		absak
 * 	@version 	June 11, 2016
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input = new Scanner(System.in);
    	double usd2eur, eur2gbp, gbp2usd;
    	double valueEUR, valueGBP, valueUSD;
    	int profit, newUSD;
    	int n = input.nextInt();
    	for(int i = 1; i <= n; i++){
    		usd2eur = input.nextDouble();
    		eur2gbp = input.nextDouble();
    		gbp2usd = input.nextDouble();
    		valueEUR = 1_00_000 / usd2eur;
    		valueGBP = valueEUR / eur2gbp;
    		valueUSD = valueGBP / gbp2usd;
    		
    		newUSD = (int)valueUSD;
    		if(newUSD > 1_00_000){
    			profit = newUSD - 1_00_000;
    		} else {
    			profit = 0;
    		}
    		System.out.println(profit);
    	}
    }
}