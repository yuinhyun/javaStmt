package algoCollection;

import java.util.Scanner;

/**
 *@file : Rank.java 
 *@author inhyeon
 *@date 2016. 3. 19.
 *@story 10명의 학생에 대한 중간고사 점수의 석차를 구하는 순서도를 작성하시오
 */
public class Rank {
	public static void main(String[] args) {
		int Jumsu[] = new int[5];
		int Rank[] = new int[5];
		int i=0;
		
		Scanner scanner = new Scanner(System.in);
		for (i = 0; i < Jumsu.length; i++) 
		{
			System.out.println("점수를 입력하세요");
			Jumsu[i] = scanner.nextInt();
			Rank[i] =1;
		}
		for (i = 0; i < Rank.length; i++) 
		{
			System.out.print(Rank[i] + "등 " + Jumsu[i] + "점 ");
		}
		
		System.out.println();
		
		for (i = 0; i < Rank.length; i++) 
		{
			for (int j = 0; j < Rank.length; j++) 
			{
			      if (Jumsu[i]<Jumsu[j]) //첫번째 점수보다 두번째점수가 클때
			      { 
			    	  Rank[i] += 1; //랭크에 1씩증가
			      }
			}
		}
		for (i = 0; i < Rank.length; i++) 
		{
			System.out.print(Rank[i] + "등 "+ Jumsu[i] + "점 ");
		}
	}
}
