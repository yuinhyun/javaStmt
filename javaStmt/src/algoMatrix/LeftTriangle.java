package algoMatrix;

/**
 * @file:LeftTriangle.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열2. 왼쪽 직각 삼각형 만들기 
1	0	0	0	0	
2	3	0	0	0	
4	5	6	0	0	
7	8	9	10	0	
11	12	13	14	15 
 */
public class LeftTriangle {
	public static void main(String[] args) {
		int len=0,val=0,col=0,row=0;
		int[][] arr = new int[5][5];
		

		for (col = 1; col <= 5; col++) { 
			for (row = 1; row <= col; row++) { //열은 행 번호까지만 증가
				val++;
				arr[col-1][row-1] = val;
			}
		}

		for (col = 0;col < 5;col++) {
			for (row = 0;row < 5;row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}
	}
}
