/**
 * 	Verdict		: Accepted
 * 	OJ			: Hackerrank
 * 
 * 	@author absakDev
 * 	@version June 13, 2016
 * 
 */
import java.lang.reflect.Method;

class Solution {
	//Write your code here
	public static <E> void printArray(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s\n", element);
		}
	}
	// solution code ends here
	
	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
