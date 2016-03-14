package forloop;

import java.util.Scanner;

/**
 *@file : Inputdan.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 입력받은 정수의 구구단 구하기
 *예를 들면 2를 입력하면 2단 출력
 *109를 입력하면 109*2 ~ 109*9
 *다만 0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력
 */
public class InputGugudanMain {
	public static void main(String[] args) 
	{
	
		System.out.println("예를 들면 2를 입력하면 2단 출력"+"109를 입력하면 109*2 ~ 109*9"+"다만 0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력");
		System.out.println("단을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		InputGugudan bean = new InputGugudan();
		bean.setDan(scanner.nextInt());
		bean.setErr();
		bean.setResult();
		
		System.out.println(bean.toString());
	}
}
