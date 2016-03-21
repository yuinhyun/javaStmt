package algoCollection;

import java.util.Scanner;

/**
 *@file : InsertionSort.java 
 *@author inhyeon
 *@date 2016. 3. 21.
 *@story 10개의 수치자료를 입력받아 배열에 저장한 후 저장된 자료 오름차순
 */
public class InsertionSort {
	public static void main(String[] args) {
		
		int Data[] = new int[10];
		int i=0, j=0, temp;
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
		
		
		for (i = 1; i < Data.length; i++) 
		{
			temp = Data[i];
			
			for (j = i-1; j>= 0 && Data[j]>temp; j--) 
			{
				Data[j+1] = Data[j];
				
			}
			Data[j+1] =temp;
			
		}
			
		for (i = 0; i < Data.length; i++) 
		{
			System.out.print((i+1)+"번째: "+Data[i]+" ");
		}
		
	}
}

