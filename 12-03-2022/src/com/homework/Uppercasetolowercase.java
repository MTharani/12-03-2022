package com.homework;

import java.util.Scanner;

public class Uppercasetolowercase 
{

	public static void main(String[] args)
	{
		String str;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Sentence");
      str=sc.nextLine();
      String str1=str.toUpperCase();
      System.out.println(str1);
      String str2=" "+str1;
      int count=0;
      for(int i=0;i<=str2.length();i++)
      {
    	  if(str2.charAt(i)=='A'&& str2.charAt(i)==' ')
    		  count++;
      }
      System.out.println("total Number of word Strating with letter A:"+count);

	}

}
