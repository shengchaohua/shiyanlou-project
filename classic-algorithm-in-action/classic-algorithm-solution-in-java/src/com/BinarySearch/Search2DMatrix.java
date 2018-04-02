package com.BinarySearch;

// leetcode No.74 & lintcode No.28. Search a 2D Matrix
public class Search2DMatrix {
	/*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
        
        int i = matrix.length - 1;
		int j = 0;
		while (i >= 0 && j < matrix[0].length) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				i--;
			} else {
				j++;
			}
		}
		return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
