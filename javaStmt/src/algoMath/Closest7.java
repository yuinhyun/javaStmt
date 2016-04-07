package algoMath;

import java.util.Scanner;

/**
 * @file : Near7.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 18.7에 가장 가까운 수 구하기
 * 10개의 1자리 양의 정수를 입력 받아 배열에 저장한 후 저장된 자료 중 7에 가장 가까운 값을 찾아 출력
 * 자료는 1자리 정수이고 근사값이 2개인 경우에는 나중에 찾은 값을 출력
 */
public class Closest7 {
	/**
	[문제]
		10개의 1자리 양의 정수를 입력받아 배열에 저장한 후
		저장된 자료 중 7에 가장 가까운 자료를 찾는 순서도를
		작성하시오. 단, 자료는 1자리 정수이고 근사값이 2개인
		경우에는 나중에 찾은 값을 출력한다
	[변수]	
		arr[i] : 입력받은 자료가 저장된 배열
		closer : 7과 비교 대상의 차이 값 중 최소값
		cnt : 입력받은 자료의 개수
		gap : 7과 비교 대상의 차이 값이 저장될 변수
		target : 7과 가장 가까운 값이 저장될 변수
	[결과]
		5의 배수의 개수 : 20, 합 : 1050
	* */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0, J = 9, L = 0, target = 0; 
		int[] arr = new int[10];
		
		System.out.print("한자리수 10개를 입력하세요 ");
		while (i < arr.length) {
			arr[i] = scanner.nextInt();
			i = i + 1;
		}
		
		for (i = 0;  i < arr.length; i++) {
			if (arr[i] > 7) {
				L = arr[i] - 7;
			} else {
				L = 7 - arr[i];
			}
			
			if (J >= L) {
				J = L;
				target = arr[i];
			}
		}
		
		System.out.println("7과 가장 가까운 값 : " + target);
	}
}
