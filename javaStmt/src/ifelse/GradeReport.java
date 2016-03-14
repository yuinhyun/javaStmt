package ifelse;

import java.util.Scanner;

/**
 *@file : GradeReport.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 성적표(점수에 따라 A~F까지 학점부여)
 *[결과]
 ***************************
 *이름	과목		점수		학점
 *--------------------------
 *홍길동	영어		89점		B
 ***************************
 *90점 이상 A
 *80점 이상 B
 *70점 이상 C
 *60점 이상 D
 *50점 이상 E
 *50점 미만 F
 *만약, 입력한 점수가 100점 초과한다든지 0점 미만이면
 *잘못 입력했습니다. 라고 메시지 주기
 */
public class GradeReport {
	public static void main(String[] args) {
		System.out.println("이름 과목 점수 를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(), subject = scanner.next();
		int grade = scanner.nextInt();
		String record ="";
		if (grade>=90&&grade<=100) {
			record = "A";
		}
		else if (grade>=80&&grade<90) {
			record = "B";
		}
		else if (grade>=70&&grade<80) {
			record = "C";
		}
		else if (grade>=60&&grade<70) {
			record = "D";
		}
		else if (grade>=50&&grade<60) {
			record = "E";
		}
		else if (grade<50&&grade>=0) {
			record = "F";
		}
		else
		{
			record ="점수를 잘못입력하셨습니다.";
		}
		
		System.out.println("******************************");
		System.out.println("이름"+"\t"+"과목"+"\t"+"점수"+"점"+"\t"+"학점");
		System.out.println("------------------------------");
		System.out.println(name+"\t"+subject+"\t"+grade+"점"+"\t"+record);
		System.out.println("******************************");
	}

}
