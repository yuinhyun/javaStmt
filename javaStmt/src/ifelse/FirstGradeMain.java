package ifelse;

import java.util.Scanner;

/**
 *@file : FirstGrade.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 이름과 점수를 입력하세요");
	
		FirstGrade bean = new FirstGrade();
		bean.setaName(scanner.next());
		bean.setaScore(scanner.nextInt());
		
		bean.setbName(scanner.next());
		bean.setbScore(scanner.nextInt());
		
		bean.setcName(scanner.next());
		bean.setcScore(scanner.nextInt());
		
		bean.setName();
		bean.setScore();
		
		System.out.println(bean.toString());
	
		
	}

}
