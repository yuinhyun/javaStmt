package ifelse; 

import java.util.Scanner; 


/** 
 * @file : BigNumber.java 
 * @author inhyeon 
 * @date 2016. 3. 11. 
 * @story 입력된 3개 숫자에서 가장 큰수 
 */ 
public class BigNumberMain { 

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in); 

		System.out.println("3개의 숫자를 입력하세요");
		
		BigNumber big = new BigNumber();
		//big.getBigNum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		System.out.println("가장 큰수는 " + big.getBigNum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()) + " 입니다."); 

	} 

}
//Big b = new Big
//{} :메모리 영역, BigNumber:
class BigNumber{
	//public BigNumber() {} 생략되있다.
	public int getBigNum(int a, int b, int c){ 
		int big = 0; 

		if (a > b || a > c) { 

			big = a; 

		} else if (b > c) { 

			big = b; 

		} else { 

			big = c; 

		} 
		return big;
		
	}
}
