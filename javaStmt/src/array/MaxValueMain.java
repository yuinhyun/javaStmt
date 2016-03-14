package array;

import java.util.Scanner;

/**
 *@file : MaxValue.java 
 *@author inhyeon
 *@date 2016. 3. 14.
 *@story 배열의 요소 중 가장 큰 값 출력
 */
public class MaxValueMain {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("정수값 3개를 입력");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();*/
		
		//int[] arr = new int[3];
		//int[0]=1;
		//int[1]=1;
		//int[2]=1;
		//int[] arr2={1,2,3};//배열에서의 널 {};로 표시
		//null은 참조형에서만 존재한다.
		//String s= "";//""=null
		int [] arr ={32,26,76,44,66,30};
		MaxValue mv = new MaxValue();
		mv.getMax(arr);
		
		System.out.println("배열중에서 가장 큰값은 "+mv.getMax(arr)+"입니다.");
		}

}
class MaxValue{
	public int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max =arr[i];
			}
			
		}
		return max;
	}
	
}
