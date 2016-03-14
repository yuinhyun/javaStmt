package ifelse;

import java.util.Scanner;

/**
 *@file : TimeCalc.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 *10000초를 입력하면 7시간 47분 13초 로 출력
 */
public class TimeCalc {
	public static void main(String[] args) {
		System.out.println("초를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int wiki = scanner.nextInt();
		int hour=0, minute =0, wikipedia=0;
		if (wiki>=3600) {
			hour = wiki/3600;
			minute= (wiki-(hour*3600))/60;
			wikipedia= wiki-((minute*60)+(hour*3600)) ;
		}
		else if(wiki<3600)
		{
			minute = wiki/60;
			wikipedia= wiki-(minute*60);
		}
		else
		{
			wikipedia= wiki;
		}
		System.out.println(hour+"시"+ minute +"분"+ wikipedia +"초");
	}
}
