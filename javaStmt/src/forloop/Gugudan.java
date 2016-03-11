package forloop;

import java.util.Scanner;

/**
 *@file : Gugudan.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 2단부터 9단까지 구구단 출력
 *단, 책받침 구구단으로 출력
 */
public class Gugudan {
	public void printGugudan(int start, int end)
	{
		System.out.println("2단부터 9단까지 구구단");
		int gugu1=0, gugu2=0, gugu3=0, gugu4=0;
		
		for (int i = 2; i <= 9; i+=4) {
			for (int j = 0; j <= 9; j++) {
				gugu1=i*j;
				gugu2=(i+1)*j;
				gugu3=(i+2)*j;
				gugu4=(i+3)*j;
				
				System.out.println(i +" * "+ j+ " = "+ gugu1 +"\t"
								+(i+1) +" * "+ j+ " = "+ gugu1 +"\t"+
								(i+2) +" * "+ j+ " = "+ gugu1 +"\t" +
								(i+3) +" * "+ j+ " = "+ gugu1 +"\t");
				
			}
			System.out.println();
		}
	
		
	}
}
