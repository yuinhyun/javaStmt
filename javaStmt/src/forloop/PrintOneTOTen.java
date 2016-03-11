package forloop;

import javafx.print.Printer.MarginType;

/**
 *@file : PrintOneTOTen.java 
 *@author inhyeon
 *@date 2016. 3. 11.
 *@story 1부터 10까지 정수값 출력(가로로 출력, \t 탭역할)
 */
public class PrintOneTOTen {
	public static void main(String[] args) {
		System.out.println("1부터 10까지 정수값 출력(가로로 출력, \t 탭역할)");
		int [] arr= new int[10];
		int num=1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=num++;
			System.out.print(arr[i]+"\t");
		}
	}
	

}
