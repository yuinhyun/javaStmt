package algoMatrix;

import java.util.Scanner;

/**
 * @file:Diagonal.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열10.대각선으로 채우기 
1	2	4	7	11	
3	5	8	12	16	
6	9	13	17	20	
10	14	18	21	23	
15	19	22	24	25
 */
public class Diagonal {
	public static void main(String[] args) {
		int len=5,col=len,row=len,val=0,spin=0;      
		int[][] arr = new int[col][row];
		for (spin=0;spin<9;spin++) { 
			for (col=0;col<5;col++) { 
				row=spin-col; 
				if (row>=0) {
					if (row<5) {
						val ++;
						arr[col][row] = val;
					}
				}
			}
		}
		for (col = 0; col < arr.length; col++) {
			for (len = 0; len < arr.length; len++) {
				System.out.print(arr[col][len] + "\t");
			}
			System.out.println();
		}
	}
}
