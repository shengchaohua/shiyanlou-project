package com.String;

public class CountAndSay {
	/**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
        String res = "1";
		for (int i = 1; i < n; i++) {
			StringBuilder tempS = new StringBuilder();
			int length = res.length();
			for (int j = 0; j < length; j++) {
				if (j == length - 1 || res.charAt(j+1) != res.charAt(j)) { 
					// ||:��·���㣬���Ϊtrue�򲻼����ұߣ����Ϊfalse��˵��û�����һλ 
					tempS.append("1").append(res.charAt(j));
				} else {
					int number = 1; // ����������ȵ�λ��
					while (j + 1 < length && res.charAt(j+1) == res.charAt(j)){
						j++;
						number++;
					}
					tempS.append(Integer.toString(number)).append(res.charAt(j));
				}
			}
			res = tempS.toString();
		}
		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay c = new CountAndSay();
		System.out.println(c.countAndSay(3));
	}

}
