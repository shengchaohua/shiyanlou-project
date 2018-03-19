package com.String;

import javax.print.DocFlavor.STRING;

public class LongestPalindromicSubstring {
	/*
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public String longestPalindrome(String s) { 
    	// This solution is right. But both lintcode and leetcode Time Exceed!
    	// O(n^3)
        String result = new String();
        if (s == null || s.isEmpty()) return result;

        int n = s.length();
        int longest = 0, left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substr = s.substring(i, j);
                if (isPalindrome(substr) && substr.length() > longest) {
                    longest = substr.length();
                    left = i;
                    right = j;
                }
            }
        }

        return s.substring(left, right);
    }

    private boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return false;

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        }

        return true;
    }
    
    public String longestPalindromeBetter(String s) {
    	// 假定扫描的每个字母是回文的中间位置（需要处理奇偶两种情况）
    	// 从该位置向两头搜索寻找最大回文长度
    	// O(n^2)
    	if (s.isEmpty()) {
    		return s;
    	}
    	
    	String res = "";
    	for (int i = 0; i < s.length(); i++) {
    		String temp = "";
    		temp = getPali(s, i, i);
    		if (temp.length() > res.length())
    			res = temp;
    		
    		temp = getPali(s, i, i+1);
    		if (temp.length() > res.length())
    			res = temp;
    	}
    	return res;
    }
    
    private String getPali(String s, int l, int r) {
    	while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
    		l--;
    		r++;
    	}
    	return s.substring(l+1, r);	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String s = "babad";
		System.out.println(l.longestPalindrome(s));
		System.out.println(l.longestPalindromeBetter("bababababababa"));
	}

}
