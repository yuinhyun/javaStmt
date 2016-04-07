package algoMath;

import java.util.Scanner;

/**
 *@file PrimeFactorzation.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 4. 4.
 *@story 소인수 분해
 */
public class PrimeFactorzation {
/**
[문제]
	정수를 입력받아 소인수를 구해 출력하는 순서도를 작성하시오
[소인수]
	1보다 큰 양의 정수 n 을 유한계의 소수의 곱으로 쓸 수 있는데,
	p1,p2,p3...,pk 를 n의 소인수, n = p1p2p3..pk 를 n의 소인수 분해라고 한다
[변수]	
	primes[] : 소인수가 저장될 배열
	target : 소인수 분해 할 입력값
	i : 배열의 인덱스
	jesu : 소인수 인자 판별값
	e : 소인수분해 할 값의 제곱근
[결과]	
	소인수 분해 할 숫자를 입력
	30
	2	3	5
 * */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("소인수 분해 할 숫자를 입력");
		int[] primes = new int[10];
		int target = s.nextInt(),i = 0,
				jesu = 2,e = 0,mok=0,nmg=0;
		while (true) {
			e = (int) Math.sqrt(target);
			while (true) {
				if (jesu > e) { // 제수가 피제수 제곱근보다 크면 소인수
					 jesu = target;
					 break;
				} else {
					// mok = ?
					// nmg = ?
					if (nmg != 0) {
						jesu++;
						continue;
					} else {
						break;
					}
				}
				
			}
			
			
			if (target == jesu) {
				for (i = 0; primes[i] != 0; i++) {
					System.out.print(primes[i]+"\t");
				}
				break;
			} else {
				target = mok;
				continue;
			}
		}
	}
}








