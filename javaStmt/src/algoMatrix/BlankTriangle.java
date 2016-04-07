package algoMatrix;

/**
 * @file:BlankTriangle.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열6. 오른쪽 빈 삼각형 만들기 

1	2	3	4	5	6	7	
8	9	10	11	12	13	0	
14	15	16	17	18	0	0	
19	20	21	22	0	0	0	
23	24	25	26	27	0	0	
28	29	30	31	32	33	0	
34	35	36	37	38	39	40
 */
public class BlankTriangle {
	public static void main(String[] args) {
		int len=7,col=0,row=0,val=0,mid=(len/2)+1,end=0;               
		int[][] arr = new int[len][len];
		for (col = 1; col <= len; col++) {
			if (col < mid) { 
				end = (len + 1) - col; 
			} else { 
				end = col;
			}
			for (row = 1; row <= end; row++) {
				val++;
				arr[col-1][row-1] = val;
			}
		}
		for (col = 0; col < arr.length; col++) {
			for (row = 0; row < arr.length; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}
	}

}
