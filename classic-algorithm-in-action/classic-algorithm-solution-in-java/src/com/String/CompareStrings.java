package com.String;

public class CompareStrings {
	/**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A == null && B == null || A.length() < B.length()) {
			return false;
		}
		int[] flag = new int[256];
		int length = A.length();
		char[] charArr1 = A.toCharArray();
		char[] charArr2 = B.toCharArray();
		for (int i = 0, j = 0; i < length; i++) {
			flag[charArr1[i]]++;
			if (j < B.length()) {
				flag[charArr2[j]]--;
				j++;
			}
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] < 0) {
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
