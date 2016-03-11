package forloop;

import java.util.Scanner;

/**
 *@file : FactorOf5.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story
 */
public class FactorOf5 {
	/**
	 * [결과]
	 * 1에서 100까지 점수까지
	 * 5배수의 갯수는 20이고
	 * 5 배수의 합은 1050이다.
	 * */
	public static void main(String[] args) {
		
		int endNum=0, count =0, sum =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("리미트값 입력");
		endNum = scanner.nextInt();
		for (int i = 0; i <= endNum; i+=5) {
			
			sum +=i;
			if(endNum%5==0)
			{
				count = count +1;
			}
		}
		//count =endNum/5;
		System.out.println("1에서 "+endNum+"까지 점수까지"+"5배수의 갯수는 "+count+"이고"+" 5 배수의 합은 "+sum+"이다.");
		
	}
}
