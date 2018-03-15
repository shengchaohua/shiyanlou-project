package com.String1;

import java.util.Arrays;

public class TwoStringsAreAnagrams {
	public boolean anagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		int[] flag = new int[256];
		char[] charArr1 = s.toCharArray();
		char[] charArr2 = t.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			flag[charArr1[i]]++;
			flag[charArr2[i]]--;
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] != 0) {
				return false;
			}
		}
		return true;
    }
	// 使用 hashmap 的方法对于比较两个字符串是否互为变位词十分有效
	// 但是在比较多个字符串时，使用 hashmap 的方法复杂度则较高。
	// 可以使用排序字符串，java中排序字符比较麻烦
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStringsAreAnagrams two = new TwoStringsAreAnagrams();
		System.out.println(two.anagram("abcd", "acbd"));
	}

}
