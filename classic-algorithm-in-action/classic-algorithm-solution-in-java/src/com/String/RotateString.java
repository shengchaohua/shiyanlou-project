package com.String;

public class RotateString {
	/**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) {
            return;
        }
        int len = str.length;
        offset = offset % len;
        reverse(str, 0, len - offset - 1);
        reverse(str, len - offset, len - 1);
        reverse(str, 0, len - 1);
    }

    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateString r = new RotateString();
		char[] strA = "abcdefg".toCharArray();
		r.rotateString(strA, 2);
		for (char c: strA) {
			System.out.print(c);
		}
	}

}
