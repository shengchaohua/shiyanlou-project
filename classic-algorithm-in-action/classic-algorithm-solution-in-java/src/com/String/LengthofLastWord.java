package com.String;

public class LengthofLastWord {
	/**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        String trimedS = s.trim();
		if (trimedS.equals("")) {
			return 0;
		}
		String[] sArr = s.split(" ");
		return sArr[sArr.length-1].length();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
