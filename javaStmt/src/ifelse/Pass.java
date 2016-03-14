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
public class Pass
{
	public static void main(String[] args) {
		System.out.println("학생이름과 자바 JSP SQL 스프링 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int java = scanner.nextInt(), jsp = scanner.nextInt(), sql = scanner.nextInt(), spring = scanner.nextInt();
		int total=java+jsp+sql+spring;
		double average= total/(double)4;
		String pass ="";
		if (average>=60) {
			pass = "합격";
		}else
		{
			pass = "불합격";
		}
		
		System.out.println("*************************************************************************");
		System.out.println("학생"+"\t"+"자바"+"\t"+"JSP"+"\t"+"SQL"+"\t"+"스프링"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+spring+"\t"+total+"\t"+average+"\t"+pass);
	}
	

}
