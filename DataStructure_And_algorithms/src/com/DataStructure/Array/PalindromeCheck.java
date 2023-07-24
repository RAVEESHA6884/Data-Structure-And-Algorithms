package com.DataStructure.Array;

public class PalindromeCheck {

	public boolean isPalindrome(String word) {
		char[] charArray=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromeCheck palindrome=new PalindromeCheck();
		if(palindrome.isPalindrome("madam")) {
			System.out.println("The String is Palindrome !!!");
		}
		else {
			System.out.println("The String is not Palindrome !!!");
		}
	}

}
