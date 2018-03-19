package com.String;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
	/**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
    	// Time Limit Exceeded!!!
        int length = strs.length;
		boolean[] flag = new boolean[length];
		for (int i = 0; i < length; i++) { //对应strs设置标志，是否是乱序字符串
			flag[i] = false;
		}
		
		List<String> resultList = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++){
				if (isAnagrams(strs[i], strs[j])) {
					flag[i] = true;
					flag[j] = true;
				} 
			}
		}
		for (int i = 0; i < length; i++) {
			if (flag[i]) {
				resultList.add(strs[i]);
			}
		}
		return resultList;
    }
    
    private boolean isAnagrams(String s, String t) {
		if (s == null && t == null) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}
		int[] flag = new int[256];
		int length = s.length();
		char[] charArr1 = s.toCharArray();
		char[] charArr2 = t.toCharArray();
		for (int i = 0; i < length; i++) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
