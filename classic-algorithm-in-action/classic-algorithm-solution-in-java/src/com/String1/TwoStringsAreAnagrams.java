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
	// ʹ�� hashmap �ķ������ڱȽ������ַ����Ƿ�Ϊ��λ��ʮ����Ч
	// �����ڱȽ϶���ַ���ʱ��ʹ�� hashmap �ķ������Ӷ���ϸߡ�
	// ����ʹ�������ַ�����java�������ַ��Ƚ��鷳
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStringsAreAnagrams two = new TwoStringsAreAnagrams();
		System.out.println(two.anagram("abcd", "acbd"));
	}

}
