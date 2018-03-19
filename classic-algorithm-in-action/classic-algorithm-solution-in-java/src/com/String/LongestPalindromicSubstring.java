package com.String;

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
    	// �ٶ�ɨ���ÿ����ĸ�ǻ��ĵ��м�λ�ã���Ҫ������ż���������
    	// �Ӹ�λ������ͷ����Ѱ�������ĳ���
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
    
    public String longestPalindromeBetter2(String s) {
    	// This method is like last. However, this return index , which save space!
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		String s = "babad";
		System.out.println(l.longestPalindrome(s));
		System.out.println(l.longestPalindromeBetter("babababababab"));
		System.out.println(l.longestPalindromeBetter2("babababababab"));
	}

}
