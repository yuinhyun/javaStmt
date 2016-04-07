package algoSeries;

/**
 *@file Fibonacci.java 
 *@author KANG-EUNJI
 *@date 2016. 4. 4.
 *@story 피보나치
 */
public class Fibonacci {
/**
[문제]
	1+1+2+3+5+8+13+... 순서로 나열되는 피보나치 수열의
	20번째 항까지의 합계를 구하는 순서도를 작성하시오
[피보나치]	
	피보나치 수열은 첫번째 + 두번째 항으로 세번째 항을 만들고,
	두번째항 + 세번째항 = 네번째항
	이런 식으로 더해가는 수열
[변수]	
	a : 첫번째항
	b : 두번째항
	c : 세번째항(a+b)
	cnt : 항의 갯수
	sum : 합계
[결과]	
	피보나치 20항까지의 합 : 17710
 * */
	public static void main(String[] args) {
		int a=1,b=1,c=2,cnt=2,sum=2;
		while (true) {
			c = a + b;
			sum += c;
			cnt++;
			if(cnt<20){
				a = b;
				b = c;
				continue;
			}else break;
		}
		System.out.printf("20번째항까지 합 : %d",sum);
	}
}







