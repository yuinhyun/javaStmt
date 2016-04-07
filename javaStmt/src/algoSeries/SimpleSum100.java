package algoSeries;
/**
 *@file SimpleSum100.java 
 *@author KANG-EUNJI
 *@date 2016. 4. 4.
 *@story 수열
 */
public class SimpleSum100 {
/**
[문제]
1+2+3+4+...+100까지의 합계를 구하는 순서도를 작성하시오
[등차수열]
	arithmetic sequence
	연속하는 두 항의 차이가 모두 일정한 수열 
	이때 두 항의 차이는 이 수열의 모든 연속하는 두 항에 대해서
	공통적으로 나타나는 차이므로, 공차(common difference) 라고 한다
[변수]
	i : 항
	sum : 합계
[결과]
5050	
 * */
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (true) {
			i++;
			sum += i;
			if (i<100)continue;
			else break;
		}
		System.out.println(sum);
	}
}










