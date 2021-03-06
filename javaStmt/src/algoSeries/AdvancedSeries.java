package algoSeries;

/**
 * @file: AdvanceSeries.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 4. 1+2+4+7+11+16+... 로 증가하는 수열
 */
public class AdvancedSeries {
/**
[문제]
	1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합게를
	구하는 순서도를 작성하시오
[변수]
	i : 항
	d : 공차
	sum : 합계
[결과]
	======================================================
	1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 
	======================================================
	1350 
	=======================================================
* */
	public static void main(String[] args) {
		int i = 0, d = 1, sum = 1;
		
		while (true) {
			i++;
			d+=i;
			sum += d;
			if(i<19)continue;
			else break;
		}
		
		System.out.printf(
				  "======================================================\n"
				+ "1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합 \n"
				+ "======================================================\n"
				+ "%d \n"
				+ "=======================================================",sum);

	}

}
