package com.bridgelabz.assignmentsArs;
import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args) {
		char ch;
		String newstr = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		sc.close();
		
		for (int i=0; i<str.length(); i++)
	      {
	        ch = str.charAt(i); //extracts each character
	        newstr = ch + newstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed String: "+ newstr);
	      
	}

}
