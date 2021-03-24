package pro.demo;

import java.util.Scanner;

public class ReverseString {
	
	static String reverseByStringBuffer(String str){
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	
	static String reverseByStringBuilder(String str){
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	static String reverseByCharAt(String str){
		String revString = "";
		for(int i = str.length()-1; i>=0; i--){
			revString += str.charAt(i);
		}
		return revString;
	}
	
	static String reversebyCharArray(String str){
		char[] ab =str.toCharArray();
		String revString = "";
		for(int i = ab.length; i > 0; i--){
			revString += ab[i-1];
		}
		return revString;
	}
	
	static String reverseByRecursion (String str){
		if (str.length()<2){
			return str;
		}
		return reverseByRecursion(str.substring(1))+str.charAt(0);
	}
	
	
	
	
	
	public static void main(String[] args) {
		String str = "ABCDEF";
		
		System.out.println(reverseByStringBuffer(str));
		System.out.println(reverseByStringBuilder(str));
		System.out.println(reverseByCharAt(str));
		System.out.println(reversebyCharArray(str));
		System.out.println(reverseByRecursion(str));
		
		}
	}
		