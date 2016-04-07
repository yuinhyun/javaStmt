package algoMath;

import java.util.Scanner;

/**
 * @file: Prime.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 11.약수구하기
 */
public class Factors {
	/**
	[문제]
		정수를 입력 받아 약수를 구해 출력하는 순서도를 작성하시오
	[약수]
		어떤 수 X 를 1부터 X까지 차례대로 나누어 나머지가
		0이 되게 하는 제수들
	[변수]	
		factors[] : 약수가 저장될 배열
		target : 입력 받은 수
		i : 출력시 배열의 인덱스
		j : factors[]의 위치 인덱스 
		mok, nmg : 몫과 나머지
	[결과]
		약수를 구하려는 정수
		28
		입력받은 숫자 : 28
		1 2 4 7 14 28 
	* */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("약수를 구하려는 정수");
        int[] factors = new int[100];
        int target = s.nextInt(), jesu=0,mok=0, nmg=0,i=0,j=0;
 
        while (true) {
            jesu++;  // 제수를 target까지 변화시키기 위해 1씩 증가시킴
            if (jesu > target) {
                System.out.println("입력받은 숫자 : " + target);
                for (i = 0; i < j; i++)
                    System.out.print(factors[i] + "\t");
                break;
            } else {
                mok = target / jesu;
                nmg = target - mok * jesu;
                if (nmg == 0) {
                    factors[j] = jesu;
                    j++;  
                }
            }
        }
    }
}
