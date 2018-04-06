package com.BitManipulation;

// problem: lintcode 1. A + B Problem
public class APlusB {
	/*
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        int res = a;
        int xor = a ^ b; // �õ�ԭλ��
        int forward = (a & b) << 1; // �õ���λ��
        if (forward != 0) { //����λ�Ͳ�Ϊ0����ݹ���ԭλ��+��λ��
            res = aplusb(xor, forward);
        } else {
            res = xor; // ����λ��Ϊ0�����ʱԭλ��Ϊ�����
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
