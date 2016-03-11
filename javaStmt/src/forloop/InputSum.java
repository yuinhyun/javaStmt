package forloop;

import java.util.Scanner;

/**
 *@file : InputSum.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 입력된 수만큼 합 구하기
 *예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSum {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <=num; i++) {
			
			sum +=i;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
