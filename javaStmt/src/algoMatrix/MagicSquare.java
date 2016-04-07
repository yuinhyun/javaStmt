package algoMatrix;

/**
 * @file:MagicSquare.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열11.마방진 p.203 
 * 마방진 : 가로의 합 = 세로의 합 = 대각선의 합
17	24	1	8	15	
23	5	7	14	16	
4	6	13	20	22	
10	12	19	21	3	
11	18	25	2	9	
 */
public class MagicSquare {
	public static void main(String[] args) {
		int len=5,col=1,row=(5 / 2) + 1,val=0;
		int[][]arr = new int[len][len];

		for (val = 1; val <= 25; val++) { // 배열에 저장되는 값
			arr[col-1][row-1] = val;
			int nmg = val - (val / 5) * 5; // 5의 배수인지 확인

			if (nmg == 0) {
				col++; // 나머지가 0이면 5의 배수 -> 행++
			} else {
				col--; // 행--
				row++; // 열++

				if (col < 1) {
					col = 5; // 행이 1보다 작으면 행=5
				}

				if (row > 5) {
					row = 1; // 열이 5보다 크면 열=1
				}
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
