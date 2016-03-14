package array;

/**
 *@file : MaxMinMain.java 
 *@author inhyeon
 *@date 2016. 3. 14.
 *@story 배열의 최대값, 최소값 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
		int[] arr = {100, 80, 69, 58, 76, 57, 49, 97};
		MaxMin mm = new MaxMin();
		mm.setMaxMin(arr);
		System.out.println(mm.toString());
	}

}
