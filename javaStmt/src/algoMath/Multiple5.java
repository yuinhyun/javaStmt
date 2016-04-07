package algoMath;
/**
 * @file : Multiple5.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 17.5의 배수의 개수와 합
 */
public class Multiple5 {
	/**
	[문제]
		 1부터 100까지의 수 중 5의 배수의 개수와 합을 출력하는
		 순서도를 작성하시오
	[결과]
		5의 배수의 개수 : 20, 합 : 1050
	* */
	public static void main(String[] args) {
		int cnt = 0, sum = 0, i=0, mok=0, nmg=0;
		
		for (i = 1; i <= 100; i++) {
			mok = i/5;
			nmg = i - mok * 5;
			
			if (nmg == 0) {
				cnt = cnt + 1;
				sum = sum + i;
			}
		}
		
		System.out.println("5의 배수의 개수 : " + cnt + ", 합 : " + sum);
	}
}
