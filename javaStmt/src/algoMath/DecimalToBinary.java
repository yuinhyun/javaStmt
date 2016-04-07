package algoMath;

import java.util.Scanner;

/**
 * @file : DecimalToBinary.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 13.10진수를 2진수로 변환
 * 10진수를 입력 받아 2진수로 변환(단, 1000이하의 숫자를 입력받는다.)
 */
public class DecimalToBinary {
	/**
	[문제]
		10진수를 입력 받아 2진수로 변환하는 순서도를 작성하시오.
		단, 1000 이하의 숫자를 입력받는다
	[방법]
		10진수를 2진수로 변환하려면 10진수를 2로 나누어
		나머지를 구한 후 저장하고 다시 몫을 2로 나누어
		나머지를 구해 저장하는 과정을 반복한다
	[변수]
		arr[j] : 입력받은 10진수를 2로 나눈 나머지(2진수)가 저장될 배열
		target : 입력된 10진수
		origin : 출력하는 10진수
		mok, nmg : 몫과 나머지 
	[결과]
		십진수를 입력하세요 
		30
		변환전 10진수 : 30
		변환후 2진수 : 11110
	* */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("십진수를 입력하세요 ");
		int target = scanner.nextInt(),i=0, j = 0, mok = 0, nmg=0, origin=0;		
		origin = target;
		while (true) {
			j++;
			mok = (int)target / 2;
			nmg = target - mok * 2;
			arr[j] = nmg;
			
			if(mok!=0){target = mok; continue;}
			else break;
		}
		System.out.printf("변환전 10진수 : %d",origin);
		System.out.println();
		System.out.print("변환후 2진수 : ");
		for (i = j ; i >= 1; i--) {
			System.out.print(arr[i]);
		}
	}
}
