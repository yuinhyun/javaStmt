package algoSeries;

/**
 * @file: Factorial.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 5.팩토리얼 수열
 */
public class Factorial {
/**
[문제]
	1!+	2! + 3! + 4! +,..10! 의 순서로 나열되는 수열의
	10번째 항까지의 합계를 구하는 순서도를 작성하시오
[변수]
	i : 항
	d : 공차
	sum : 합계
[결과]
	=======================================
	1!+2! + 3! + 4! +,..10!  팩토리얼 의 합 
	=======================================
	4037913 
	=======================================
* */
	public static void main(String[] args) {
		int i = 1, d = 1, sum = 1;
		
		while (true) {
			i++;
			d *= i;
			sum += d;
			if(i < 10)continue;
			else break;
		}
		System.out.printf(
				  "=======================================\n"
				+ "1!+2! + 3! + 4! +,..10!  팩토리얼 의 합 \n"
				+ "=======================================\n"
				+ "%d \n"
				+ "=======================================",sum);
	}
}