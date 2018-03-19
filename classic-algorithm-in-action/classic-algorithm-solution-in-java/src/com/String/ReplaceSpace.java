package com.String;

public class ReplaceSpace {
	// 原地改变字符串，字符串是字符数组的形式
	public int replaceBlank(char[] string, int length) {
        if (string == null) 
            return 0;

        int space = 0;
        for (char c : string) {
            if (c == ' ') 
            	space++;
        }

        int r = length - 1 + 2 * space;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] != ' ') {
                string[r] = string[i];
                r--;
            } else {
                string[r--] = '0';
                string[r--] = '2';
                string[r--] = '%';
            }
        }

        return length + 2 * space;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceSpace r = new ReplaceSpace();
		char [] str = {'s', ' ', 'c', ' ', 'h', ' ', '0', '0', '0', '0', '0', '0', '0'};
		System.out.println(r.replaceBlank(str, 6));
	}

}
