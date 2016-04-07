package algoMath;

import java.util.Scanner;

/**
 *@file Prime.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 4. 4.
 *@story 소수 판별
 */
public class Prime {
/**
[문제]
	임의의 정수를 입력하여 소수를 판별하는 순서도를 작성하시오
[소수]	
	prime number
	1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수
	이를테면 2,3,5,7,11,13,17,19,23,29,31,.. 등은 모두
	소수이다.
	정수론에서 매우 중요한 역할을 담당한다.
	현재에 와서는 암호 분야에서의 사용으로 그 중요성이 부각되고 있다.
[변수]	
	target : 소수인지 판별하기 위해 입력받은 수
	i : target 보다 1 작은 수
	j : 2부터 1까지 1씩 증가하는 수 예) i가 5이면 j 는 2,3,4,5 로 변경
[결과]	
	소수판별 정수 입력
	8
	8 : 소수가 아니다
 * */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("소수판별 정수 입력");
		int target = s.nextInt(),i=target-1,j=2;
		while (true) {
			if (j <= i) {
				if ((target % j)==0) {
					System.out.println(target + ": 소수");
					break;
				} else {
					j++;
					continue;
				}
			} else {
				System.out.println(target + ": 소수");
				break;
			}
		}
	}
	
	
}
