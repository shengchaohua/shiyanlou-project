package com.MathAndBitManipulation;

// problem: lintcode 128. Hash Function
public class HashFunction {
	/**
     * @param key: A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     */
    public int hashCode(char[] key, int HASH_SIZE) {
        // Intuitive solution
    	if (key == null || key.length == 0) {
    		return -1;
    	}
    	
    	long hashSum = 0;
    	for (int i = 0; i < key.length; i++) {
    		hashSum += key[i] * modPow(33, key.length - i - 1, HASH_SIZE);
    		hashSum %= HASH_SIZE;
    	}
    	
    	return (int)hashSum;
    }
	
    private long modPow(int base, int n, int mod) {
    	if (n == 0) {
    		return 1;
    	} else if (n == 1) {
    		return base % mod;
    	} else if (n % 2 == 0) {
    		long temp = modPow(base, n / 2, mod);
    		return (temp % mod) * (temp % mod) % mod;
    	} else {
    		return (base % mod) * modPow(base, n-1, mod) % mod;
    	}
    }
    
    public int hashCode2(char[] key, int HASH_SIZE) {
    	if (key == null || key.length == 0) {
    		return -1;
    	}
    	
    	long hashSum = 0;
    	for (int i = 0; i < key.length; i++) {
    		hashSum = 33 * hashSum + key[i];
    		hashSum %= HASH_SIZE;
    	}
    	
    	return (int)hashSum;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashFunction h = new HashFunction();
		char[] c= new String("abcd").toCharArray();
		System.out.println(h.hashCode(c, 100));
	}

}
