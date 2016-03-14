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
		big.setA(scanner.nextInt());
		big.setB(scanner.nextInt());
		big.setC(scanner.nextInt());
		big.setBig();
		
		

		System.out.println(big.toString()); 

	} 

}

