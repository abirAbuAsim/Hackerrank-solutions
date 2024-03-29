import java.io.*;
import java.util.*;

public class Solution {
	static boolean status[];
	public static void setStatus(int size) {
		status = new boolean[size+1];
	}
	public static void isPrimeWithSieve(int num) {
		int sq = (int)Math.sqrt(num);
		for(int i = 4; i <= num; i += 2) {
			status[i] = true;
		} 
		for(int i = 3; i <= sq; i += 2) {
			if(status[i] == false) {
				for(int j = i * i; j <= num; j += i) {
					status[j] = true;
				}
			}
		}
	}

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int T = input.nextInt();
    	int N;
    	for(int I = 1; I <= T; I++) {
    		N = input.nextInt();
    		setStatus(N);
    		isPrimeWithSieve(N);
    		if(!status[N]) {
    			System.out.println("Prime");
    		}else {
    			System.out.println("Not prime");
    		}
    	}
    }
}