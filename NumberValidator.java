package com.jap.wrapper;

import java.util.Scanner;

public class NumberValidator {

    //validation rules to be written
    public int validateNumber(String input) {
		if(input.isEmpty())
			return -1;
		try{
			Long.parseLong(input);
			if(input.length()==10)
			{
				int sum = 0;
				for(int i=0;i<10;i++)
				{
					int temp = Integer.valueOf(input.charAt(i));
					sum += temp*(10 - i);
				}
				if(sum%11==0)
					return 1;
				else
					return 0;
			}
		}
		catch(NumberFormatException e)
		{
			throw e;
		}
		return 0;
    }
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ISBN Number : ");
		String str = sc.next();
		sc.close();
		
		NumberValidator nm = new NumberValidator();
		System.out.println(nm.validateNumber(str));
	}
}
