package algoCollection;

import java.util.Scanner;
/**
 *@file : BubleSort.java 
 *@author inhyeon
 *@date 2016. 3. 19.
 *@story 배열에 기억된 10건의 자료를 오름차순으로 정렬
 */
public class BubleSort {
	public static void main(String[] args) {
		int Data[] = new int[10];
		int i,j,k; 
		int temp = 0 ;
		
		Scanner scanner = new Scanner(System.in);
		for (i = 0; i < Data.length; i++) //숫자입력
		{
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			Data[i]=scanner.nextInt();
			
		}
		
		for (i = 0; i < Data.length; i++) //차례대로 들어왔는지 확인
		{
			 System.out.print((i+1)+"번째: "+Data[i]+" ");
		}
		System.out.println();
		
		for ( j = 0; j < Data.length; j++)//첫번째
		{
			for ( k = 0; k <Data.length-1; k++)//두번째
			{
				if(Data[k] > Data[k+1])//오름차순
				{
					temp = Data[k];
					Data[k] = Data[k+1];
					Data[k+1] = temp;
				}
			}
		}
		
		 for(i=0; i<Data.length; i++) 
		 {  
			 System.out.print((i+1)+"번째: "+Data[i]+" ");
		 }
	}

}
