package algoMatrix;

/**
 *@file Matrix.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 4. 4.
 *@story 기본 행렬
 */
public class Matrix {
	public static void main(String[] args) {
		int len = 5, col = 0, row = 0, val = 0;
		int[][] arr = new int[len][len];
		for (col = 0; col < len; col++) {
			for (row = 0; row < len; row++) {
				val++;
				arr[col][row] = val;
			}
		}
		for (col = 0; col < len; col++) {
			for (row = 0; row < len; row++) {
				System.out.print(arr[col][row]+"\t");
			}
			System.out.println();
		}
	}
}
