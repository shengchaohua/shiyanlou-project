package com.String1;

public class LongestCommonSubstring {
	/**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        if (A.length() == 0 || B.length() == 0) {
			return 0;
		}
		int lcs = 0;
		char[] charA = A.toCharArray();
		char[] charB = B.toCharArray();
		
		for (int i = 0; i < charA.length; i++) {
			for (int j = 0; j < charB.length; j++) {
				int lcsTemp = 0;
				while ((i + lcsTemp < charA.length) &&
					(j + lcsTemp < charB.length) &&
					(charA[i + lcsTemp] == charB[j + lcsTemp])) {
					lcsTemp++;
				}
				lcs = lcsTemp > lcs ? lcsTemp : lcs;
			}
		}
		return lcs;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubstring l = new LongestCommonSubstring();
		System.out.println(l.longestCommonSubstring("string", "ring"));
	}

}
