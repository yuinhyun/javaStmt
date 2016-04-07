package algoSeries;

/**
 * @file Fraction.java
 * @author KANG-EUNJI
 * @date 2016. 4. 4.
 * @story 분수수열
 */
public class Fraction {
	/**
	[문제]
	-(1/2)+(2/3)-(3/4)+(4/5)-(5/6)...-(99/100) 의 합계를
	구하는 순서도를 작성하시오
	[변수]
	i : 항
	sum : 합계
	
	 * */
	public static void main(String[] args) {
		double sum = 0.0;
		int i = 0; 
		while (true) {
			i++; // 분자를 증가
			
			if ((i/2)==(double)i/2) {
				sum += i/(i+1);
			} else {
				sum -= i/(i+1);
			}
			
			if (i>=99)break;
			else continue;
		}
		System.out.printf("결과 : %f",sum);
	}
}
