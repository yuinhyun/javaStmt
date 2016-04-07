package algoMatrix;

/**
 * @file:Snail.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열9.달팽이

5행 5열의 배열에 다음과 같이
기억시키는 순서도를 작성하시오.

1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9
 */
public class Snail {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int val = 0,flag = 1,col = 1,row = 0,count = 5,cursor=0;
		// flag : 증감 여부, count : 수행횟수, cursor : 행렬의 위치
		while (true) {

			for (cursor = 1; cursor <= count; cursor++) { //행고정 열증감
				val++;
				row = row + flag;
				arr[col - 1][row - 1] = val;
			}

			count--; //수행횟수--

			if (count > 0) {
				for (cursor = 1; cursor <= count; cursor++) { //열고정 행증감
					val++;
					col = col + flag;
					arr[col - 1][row - 1] = val;
				}

			} else {
				break;
			}
			flag = flag * (-1); //행과 열의 증감 결정
		}

		//출력
		for (col = 0; col < arr.length; col++) {
			for (row = 0; row < arr.length; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}

	}

}
