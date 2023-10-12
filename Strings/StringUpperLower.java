package Strings;

import java.util.Scanner;

public class StringUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to copy
		String sb ="shiv";
		String s="";
		for(int i=0;i<sb.length();i++) {
			s= s +sb.charAt(i);			
		}
		System.out.println(s);
		
		// to change case
		char c='A';
		c=(char) (c+32);
		System.out.println(c);
		
		// to change mixed case
		
		String a="iNhGoN";
		String b="";
		for(int i=0;i<a.length();i++) {
			if((a.charAt(i)>='A') && (a.charAt(i)<='Z')) {
				b=b+ (char)(a.charAt(i)+32);
			}
			else
				b=b+ (char)(a.charAt(i)-32);
		}
		System.out.println(b);
		
		
		//to change lower to upper
		Scanner scan =new Scanner(System.in);
		System.out.println("write a word in lower");
		String s1=scan.nextLine();
		System.out.println(s1);
		String s2=""	;
		for(int i=0;i<s1.length();i++) {
			s2= s2 +(char)(s1.charAt(i)-32);
		}
		System.out.println(s2);
		
		//to copy upper to lower
		System.out.println("write a word in upper");
		String s3=scan.nextLine();
		System.out.println(s3);
		String s4=""	;
		for(int i=0;i<s3.length();i++) {
			s4= s4 +(char)(s3.charAt(i)+32);
		}
		System.out.println(s4);

	}

}
