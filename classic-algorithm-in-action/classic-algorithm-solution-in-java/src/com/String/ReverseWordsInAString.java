package com.String;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
        // write your code
        StringBuilder stringBuilder = new StringBuilder();
		String[] stringArr = s.trim().split(" ");
		for (int i = stringArr.length-1; i >= 0; i--) {
			if (stringArr[i].equals("")) {
				continue;
			}
			stringBuilder.append(" ");
			stringBuilder.append(stringArr[i]);
		}
		return stringBuilder.toString().trim();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sheng chao  hua";
		ReverseWordsInAString r = new ReverseWordsInAString();
		System.out.println(r.reverseWords(s));
	}

}
