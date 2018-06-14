package com.company.loops;

public class FibonacciNumber {
	
	
	public static void main(String[] args) {
		
	
		
		
		int count = 7;
		int num1 = 0;
		int num2= 1;
		
		for(int i=0;i<=count;++i) {
			
			
			System.out.println(num1 + " " );
			
			int sumOfPrevTwo = num1+num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			
				
			
		}
		 
	}

}
