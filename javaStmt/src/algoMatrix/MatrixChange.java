package algoMatrix;

/**
 *@file MatrixChange.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 4. 4.
 *@story 행렬 변환
 */
public class MatrixChange {
/**
== 변환 전 ==
1	2	3		
4   5   6
7   8   9	
10  11  12	
13  14  15
== 변환 후 ==
1	2	3   4   5		
6   7   8   9   10
11  12  13  14  15
 * */
	public static void main(String[] args) {
		int len5=5,len3=3, col = 0, row = 0, val = 0;
		int[][] arr = new int[len5][len3];
		System.out.println("변환 전");
		for (col = 0; col < len5; col++) {
			for (row = 0; row < len3; row++) {
				val++;
				arr[col][row] = val;
			}
		}
		for (col = 0; col < len5; col++) {
			for (row = 0; row < len3; row++) {
				System.out.print(arr[col][row]+"\t");
			}
			System.out.println();
		}
		System.out.println("변환 후");
		
	}
}
