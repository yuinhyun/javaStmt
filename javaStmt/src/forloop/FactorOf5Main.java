package forloop;

import java.util.Scanner;

/**
 *@file : FactorOf5.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story
 */
public class FactorOf5Main {
	/**
	 * [결과]
	 * 1에서 100까지 점수까지
	 * 5배수의 갯수는 20이고
	 * 5 배수의 합은 1050이다.
	 * */
	public static void main(String[] args) {
		
		int endNum=0, count =0, sum =0;
		FactorOf5 bean = new FactorOf5();
		Scanner scanner = new Scanner(System.in);
		System.out.println("리미트값 입력");
		bean.setEndNum(scanner.nextInt());
		bean.setCount();
		bean.setSum();
		System.out.println(bean.toString());
	}
}
