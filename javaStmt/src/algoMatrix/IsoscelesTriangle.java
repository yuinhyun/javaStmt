package algoMatrix;

/**
 * @file:IsoscelesTriangle.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열7. 이등변 삼각형 만들기 p.191
 */
public class IsoscelesTriangle {
	public static void main(String[] args) {
		int len = 4, col = len, row = (len * 2) - 1, val = 0, start = 0, end = 0;
		int[][] arr = new int[row][col];

		for (row = 1; row <= len; row++) {// 열
			start = (len + 1) - row; // 열이 증가할 때마다 시작행 -1
			end = row + (len - 1); // 열이 증가할 때마다 끝행 +1

			for (col = start; col <= end; col++) {
				val++;
				arr[col-1][row-1] = val;
			}
		}
		// row 값이 초기화 되므로, 출력시는 7로 결정해 둠
		for (col = 0; col < 7; col++) {
			for (row = 0; row < len; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}
	}
}
