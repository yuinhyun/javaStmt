package forloop;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author inhyeon
 * @date 2016. 3. 11.
 * @story 최고점, 최저점 구하기 [결과] 학생들 평균점수를 입력하시면 최고점, 최저점이 출력됩니다. 단, 정원은 5명입니다. 평균점수를
 *        입력하세요
 *
 *        최고점은 100점이고 최저점은 30점입니다.
 */
public class MaxMinMain {
	public static void main(String[] args) {
		
		System.out.println("학생들 평균점수를 입력하시면 최고점, 최저점이 출력됩니다." + "단, 정원은 5명입니다." + "평균점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int[]arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		MaxMin bean = new MaxMin();
		bean.setMaxMin(arr);
		
		
		System.out.println(bean.toString());
		

			

		}

}
