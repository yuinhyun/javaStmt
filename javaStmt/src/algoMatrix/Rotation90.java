package algoMatrix;

/**
 * @file:Rotation90.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열8. 90도 회전하기
배열에 A와 같이 입력한 후 90도 회전한 결과를 
배열B 에 이동하는 순서도를 작성하시오.
=== 배열A ===
11	12	13	14	15	
0	7	8	9	10	
0	0	4	5	6	
0	0	0	2	3	
0	0	0	0	1	
=== 배열B ===
0	0	0	0	11	
0	0	0	7	12	
0	0	4	8	13	
0	2	5	9	14	
1	3	6	10	15	
 */
public class Rotation90 {
	public static void main(String[] args) {
		int len=5,val=0,col=0,row=0;
		int[][] arrA = new int[len][len]; 
		int[][] arrB = new int[len][len]; 
		for (col = 5; col >= 1; col--) {
			for (row =col; row <= 5; row++) {
				val++;
				arrA[col-1][row-1]=val;
			}
		}
		for (col = 0; col < len; col++) {
			for (row = 0; row < len; row++) {
				System.out.print(arrA[col][row]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		for (col = 1;col <=5;col++) {
			for (row = 1; row <= 5; row++) {
				arrB[row-1][5-col] = arrA[col-1][row-1]; //B[0][4] = A[0][0]
			}
		}
		
		for (col = 0;col < len; col++) {
			for (row = 0;row < len; row++) {
				System.out.print(arrB[col][row]+"\t");
			}
			System.out.println();
		}
	}
}
