package algoMatrix;

/**
 * @file:RowFixColChange.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열1. 행고정 열변화 5행 5열의 배열에 다음과 같이 기억시키는 순서도를 작성하시오.
 * 
 *        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
 */
public class RowFixColChange {
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
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();

		}

	}
}
