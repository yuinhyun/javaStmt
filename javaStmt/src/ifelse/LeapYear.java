package ifelse;

import java.util.Scanner;

/**
 *@file : LeapYear.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 윤년 프로그램
 *연도를 4로 나눈값이 0이라면 윤년일 수 있다.
 *그러나 해당 년도가 100으로 나눠 떨어지면 평년이다.
 *평년이라 해도 400으로 나눠 떨어지면 윤년이다.
 *예를 들면 1000년은 4로 나눈값이 0이라서 윤년일수 있는데
 *다시 이값이 100으로 나눠 떨어지므로 평년이 된다.
 *2016년은 윤년입니다. 그래서 테스트 값이 2000을 입력했는데
 *윤년이라 나오고,1000을 입력하면 평년 2016 을 입력했을때 윤년이라 나오면 정확
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("판별하려는 년도를 입력");
		int year = scanner.nextInt();
		String yearStr = "";
		if(year %100==0)//100으로 나눠 떨어진다.
		{
			yearStr = "윤년";
			
		}else{
			yearStr = "평년";
			
		}
		System.out.println();
	}
}
