package algoMatrix;

/**
 * @file:Zigzag.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열3. ㄹ 자로 채우기 p.180
 */
public class Zigzag {
	public static void main(String[] args) {
		System.out.println("--");
		int[][] arr = new int[5][5];
		int val=0; //배열에 저장될 변수
		int begin=1; //시작위치
		int end=5; //끝위치
		int n=1; //증가 값
		int flag=1; //시작과 끝 바꿀 임시 변수
		int temp=0;
		for (int i = 1; i <= 5; i++) {
			for (int j = begin; j <=end; j++) {
				val++;
				arr[i-1][j-1]=val;
			}
			temp=begin;
			begin=end;
			end=temp;
			System.out.println(":::::::::: 플랙 ::::::::"+flag);
			
			for (int j = end; j <=begin; j--) {
				val++;
				arr[i-1][j-1]=val;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
