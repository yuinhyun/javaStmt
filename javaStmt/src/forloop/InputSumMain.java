package forloop;

import java.util.Scanner;

/**
 *@file : InputSum.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 입력된 수만큼 합 구하기
 *예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSumMain {
	public static void main(String[] args) {
		InputSum bean = new InputSum();
		System.out.println("숫자를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		bean.setNum(scanner.nextInt());
		bean.setSum();
		
		System.out.println(bean.toString());
	}

}
