package algoMath;

import java.util.Scanner;

/**
 * @file : BigNumSum.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 21.큰 수 더하기
 * 100건 이내의 12자리로 구성된 숫자를 더하라.
 * 단, 12자리의 숫자는 각 자리가 분리되어 배열에 입력된다.
 * 단, 배열의 첫 번째 요소로 0을 입력 받으면 계산 후 결과를 출력하고 프로그램을 종료한다.
 * 단, 결과값이 들어갈 배열에는 초기 값으로 0이 들어 있다고 가정
 */
public class BigNumSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[5], B = new int[6];
		int i, j, mok, nmg;

		do {
			System.out.print("숫자를 입력하세요 ");
			for (i = 0; i < A.length; i++) {
				A[i] = scanner.nextInt();
			}
			
			for (i = B.length-1; i > 0; i--) {
				B[i] = B[i] + A[i-1];
			}
			
		} while (A[0] != 0);
		
		for (j = B.length-1; j > 0; j--) {
			mok = B[j] / 10;
			nmg = B[j] - mok * 10;
			B[j] = nmg;
			B[j-1] = B[j-1] + mok;
		}
		
		System.out.print("결과 >> ");
		for (j = 0; j < B.length; j++) {
			System.out.print(B[j]);
		}
	}
}
