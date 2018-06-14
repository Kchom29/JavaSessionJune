package com.comany.dayone;

import java.util.Scanner;

public class DayOne {
	
	public static void main (String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		int num1;
	
		System.out.println("Enter Number : ");
		num1 = scan.nextInt();
		
		
		scan.close();
		
		
		if ((num1%2!=0)&&(num1<100)){
			
			System.out.println("Weird");
		}
		
		else if (num1%2==0) {
			 if ((num1>=2)&&(num1<=5)) {
				 System.out.println("Not Weird");
			 } 
				 else if((num1>6)&&(num1<=20)) {
				 System.out.println("Weird");
				 
			 }else if ((num1>20) && (num1<=100)){
			System.out.println("Not Weird");
			 }
	
			
		}}}
		
		