package org.lnt.practice;

import java.util.Iterator;

public class OuterClass

{
	
//	public static String recursion (String str) {
//		if(str.isEmpty()) {
//			return str;
//			
//		}
//		else {
//			return recursion(str+str.substring(1))+str.charAt(0);
//					
//		}
		
		
	
 public static void main(String[] args) {
// OuterClass.recursion("harshavardhan");
	 String str= "harshavardhan kukanoor is java Developer in lti super";
	
	 String reverseString="";
	String[] words=str.split(" ");
	for(String w1:words) {
		String reverseWord="";
		for(int i=w1.length()-1;i>=0;i--) {
			reverseWord=reverseWord+w1.charAt(i);
			
		}
		reverseString=reverseString+reverseWord+" ";
	}
	
	System.out.println(reverseString);
	
	 
	
		 
//	 String rev="";
//	  String rev1= "";
//	 
//	 char[] arr= str.toCharArray();
//	for (int i = str.length()-1; i>=0; i--) {
//		
//		rev= rev+arr[i];
//		
//		
//	}
//	System.out.println(rev);
//	
//	for (int i = str1.length()-1; i >=0; i--) {
//		
//		rev1=rev1+str1.charAt(i);
//		
//		
//	}
//	
//	System.out.println(rev1);
//
//
//




	
	
}
}
