package algoMath;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 16.최대값, 최소값 구하기
 */
public class MaxMin {
	/**
	[문제]
		10개의 수치 자료를 입력받아 배열에 저장한 후
		저장된 자료 중 가장 큰 값을 찾는 순서도를 작성하시오.
	[변수]
		arr[i] : 10개의 입력값
		max : 가장 큰 수
	[결과]
		10개의 수를 입력하세요 
		70
		82
		43
		90
		65
		55
		95
		45
		68
		72
		최대값 : 95
	* */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 0, max = 0;
		
		System.out.println("10개의 수를 입력하세요 ");
		while (true) {
			arr[i] = scanner.nextInt();
			i++;
			if (i < 10) {
				continue;
			} else {
				break;
			}
		}
		
		for (i = 0; i < 10; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
	}
}
