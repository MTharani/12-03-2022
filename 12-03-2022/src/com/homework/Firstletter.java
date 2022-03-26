package com.homework;

import java.util.Scanner;

public class Firstletter {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str=sc.nextLine();
		String str1=" ";
		for(int i=0;i<str.length();i++)
		{
			if(i==0||str.charAt(i-1)==' ')
			{
				str1=str1+Character.toUpperCase(str.charAt(i));
			}
			else
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
		sc.close();

	}

}
