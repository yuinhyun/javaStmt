package ifelse;

import java.util.Scanner;

/**
 *@file : Pass.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 과목 점수를 입력하면 총점과 평균이 나오고
 *이를 통해 합격 여부를 통지하는 프로그램
 *[결과]
 *************************************************************
 *학생	자바		JSP		SQL		스프링	총점		평균		합격여부
 *------------------------------------------------------------
 *홍길동	80		40		60		70		250		62.5	합격
 *************************************************************
 *합격 여부는 60 이상이면 합격
 */
public class PassMain
{
	public static void main(String[] args) {
		System.out.println("학생이름과 자바 JSP SQL 스프링 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		Pass bean = new Pass();
		
		bean.setName(scanner.next());
		bean.setJava(scanner.nextInt());
		bean.setJsp(scanner.nextInt());
		bean.setSql(scanner.nextInt());
		bean.setSpring(scanner.nextInt());
		bean.setTotal();
		bean.setAvg();
		bean.setPass();
		
		
		System.out.println("*************************************************************************");
		System.out.println("학생"+"\t"+"자바"+"\t"+"JSP"+"\t"+"SQL"+"\t"+"스프링"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(bean.toString());
	}
	

}
