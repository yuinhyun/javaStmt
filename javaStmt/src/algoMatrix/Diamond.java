package algoMatrix;

/**
 * @file:Diamond.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열4. 다이아몬드 만들기 
 0	0	1	0	0	
0	2	3	4	0	
5	6	7	8	9	
0	10	11	12	0	
0	0	13	0	0	
 */
public class Diamond {
	public static void main(String[] args) {
		int len=5,col=len,row=len,val=0,start=0,end=0; //배열에 저장할 변수
		int[][]arr = new int[col][row];
		start=3; //열의 시작 위치
		end=3; //열의 끝 위치
		
		for (col = 1; col <= 5; col++) {
			for (row = start; row <= end; row++) {
				val+=1;
				arr[col-1][row-1]=val;
			}
			if(col>=3){ //i가 3~5인 행은 시작위치++ 끝위치--
				start++;
				end--;
			}else{ //i가 1~3인 행은 시작위치-- 끝위치++
				start--;
				end++;
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
