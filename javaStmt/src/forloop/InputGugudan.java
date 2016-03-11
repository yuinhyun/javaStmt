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
public class InputGugudan {
	public static void main(String[] args) 
	{
		System.out.println("예를 들면 2를 입력하면 2단 출력"+"109를 입력하면 109*2 ~ 109*9"+"다만 0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력");
		System.out.println("단을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		if(dan<=0)
		{
			System.out.println("다시 입력해주세요");
			return;// 이 메소드를 종료시켜라
		}
		for (int i = dan ; i <= dan; i++) 
		{
				for (int j = 1; j < 10; j++)
				{
					System.out.println(dan +" * "+ j+ " = "+ dan*j);
					
				}
				
		}
	}
}
