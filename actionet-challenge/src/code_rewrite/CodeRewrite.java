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
	 * This function only works for integers from 0-9 inclusive.
	 */
	public static void newFunc(int n) {
		if (n < 0 || n > 9) {
			throw new IllegalArgumentException("Input must be between 0 and 9 inclusive");
		}
		int i = 1;
		char[] s = new char[n];
		Arrays.fill(s, '.');
		
		while (i <= n) {
			Arrays.fill(s, n-i, n, (char) (i + '0'));
			System.out.println(s);
			i++;
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Output of Original Function");
		originalFunc();
		
		System.out.println();
		
		int x = 9;
		System.out.printf("Output of New Function with input = %d\n", x);
		newFunc(x);

	}

}
