package com.javapractise.programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 12321;
		int temp = num;
		int rem = 0;
		int rev = 0;
		
		while(num!=0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
			
		}

		if (rev ==temp)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}

}
