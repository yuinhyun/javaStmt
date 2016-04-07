package algoMatrix;

/**
 * @file:SandGlass.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열5. 모래시계 만들기
 * 
[문제] 배열의 크기를 입력받아 배열의 크기에 따라
아래와 같이 기억시키는 순서도를 작성하시오.
단, 배열의 크기는 홀수로만 입력이 가능하고,
여기에서는 5를 입력받았다고 가정한다.
1	2	3	4	5	
0	6	7	8	0	
0	0	9	0	0	
0	10	11	12	0	
13	14	15	16	17
 */
public class SandGlass {
	public static void main(String[] args) {
		int len = 5; // 배열의 크기 입력 5
		int[][] arr = new int[len][len];
		int val=0,col=0,row=0,start=len+1,mid=(len/2)+1;  
		// start : 행(i)의 시작위치
		// mid : 행의 중간 번호(중간 번호를 중심으로 행의 시작위치 증가)
		
		for (col = 1; col <=mid; col++) {
			start=start-1; //중간 행까지 i가 증가될 때마다 행의 시작위치 -1씩 감소
			for (row = col; row <=start; row++) {
				val++;
				arr[col-1][row-1] = val;
			}
		}
		for (col = mid+1; col <=5; col++) {
			start=start-1;
			for (row = start; row <=col; row++) {
				val++;
				arr[col-1][row-1] = val;
			}
		}
		
		//출력
		for (col = 0; col < len; col++) {
			for (row = 0; row < arr.length; row++) {
				System.out.print(arr[col][row]+"\t");
			}
			System.out.println();
		}
	}

}