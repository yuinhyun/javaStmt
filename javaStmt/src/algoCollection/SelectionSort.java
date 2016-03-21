package algoCollection;

import java.util.Scanner;

/**
 *@file : SelectionSort.java 
 *@author inhyeon
 *@date 2016. 3. 19.
 *@story 10개의 수치자료를 입력받아 배열에 저장한 후 저장된 자료를 오름차순으로 정렬하는 순서도를 작성하시오
 */
public class SelectionSort {
	public static void main(String[] args) {
		
		int Data[] = new int[10];
		int i=0, j = 0, k =0; 
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
		
		for (i = 0; i < Data.length; i++) 
		{
				
				for ( j = 0; j < Data.length; j++) 
				{
					if (Data[i] >= Data[j]) 
					{
						temp = Data[i];
						Data[i] = Data[j];
						Data[j] = temp;	
					}
				}
		}
		
		 for(i=0; i<Data.length; i++) 
		 {  
			 System.out.print((i+1)+"번째: "+Data[i]+" ");
		 }
	}
}
