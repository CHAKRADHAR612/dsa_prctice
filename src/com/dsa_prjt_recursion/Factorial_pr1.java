package com.dsa_prjt_recursion;

public class Factorial_pr1 {

	public static void main(String[] args) {
		int n=6;
		int result=factorial(n);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int result=n*factorial(n-1);
		return result;
	}

}
