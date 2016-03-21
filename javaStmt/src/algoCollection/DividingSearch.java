package algoCollection;

import java.util.Scanner;

/**
 *@file : DividingSearch.java 
 *@author inhyeon
 *@date 2016. 3. 20.
 *@story 키보드로 입력받은 값이 Data 배열의 몇번째에 기억되어 있는지 알아보기 위해 출력하는 순서도를 작성하시오
 *단, Data(10)에는 10개의 숫자가 들어있으며, 찾는 자료가 없을 경우 자료와 함꼐 "Not Found"를 출력하고 끝낸다.
 */
public class DividingSearch {
	public static void main(String[] args) {
		
		int Data[] = new int[5];
		int i =0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (i = 0; i < Data.length; i++) 
		{
			System.out.println((i+1)+" 번째 숫자를 입력해주세요");
			Data[i] = scanner.nextInt();
			
		}
		
		System.out.println("찾을 숫자를 입력해주세요");
		int Search = scanner.nextInt();
		
		
		boolean flag =false;
		
		for (i = 0; i < Data.length; i++) 
		{
			if(Search==Data[i])
			{
				flag = true;
				
			}
		}
		
		if (flag) 
		{
			System.out.println(Search+"숫자를 찾았습니다.");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}

