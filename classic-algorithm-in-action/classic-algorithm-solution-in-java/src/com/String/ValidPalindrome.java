package com.String;

public class ValidPalindrome {
	/**
     * @param string
     * @return boolean {Whether the string is a valid palindrome}
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if (s.isEmpty() || s == null) {
			return true;
		}
		char[] sCharArr = s.toCharArray(); 
		int low = 0;
		int high = sCharArr.length - 1;
		while (low < high) {
			if (!Character.isLetterOrDigit(sCharArr[low])) {
				low++;
				continue;
			}
			if (!Character.isLetterOrDigit(sCharArr[high])) {
				high--;
				continue;
			}
			if (Character.toLowerCase(sCharArr[low]) == Character.toLowerCase(sCharArr[high])) {
				low++;
				high--;
			} else {
				return false;
			}
		}
		return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
