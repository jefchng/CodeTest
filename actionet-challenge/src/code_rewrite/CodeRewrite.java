package code_rewrite;

import java.util.*;

public class CodeRewrite {

	/*
	 * Rewrite the code to only use 1 control structure (You can use any Java built-in library you want). 
	 * How would you rewrite this for the nth number instead of ending at 5?
	 */
	
	public static void originalFunc() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("."); 
			}
			for (int k = 1; k <= i; k++) { 
				System.out.print(i);
			}
			System.out.println(); 
		}
	}

	/*
	 * Rewritten Function with only 1 loop
	 */
	public static void newFunc(int n) {
		if (n < 0) throw new IllegalArgumentException("Input must be nonnegative");
		String[] arr = new String[n]; 
		Arrays.fill(arr, ".");
		for (int i = 1; i <= n; i++) {
			Arrays.fill(arr, n-i, n,  i+"");
			System.out.println(Arrays.toString(arr).replaceAll(", |\\[|\\]", ""));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Output of Original Function");
		originalFunc();
		
		System.out.println();
		
		int x = 6;
		System.out.printf("Output of New Function with input = %d\n", x);
		newFunc(x);


	}

}
