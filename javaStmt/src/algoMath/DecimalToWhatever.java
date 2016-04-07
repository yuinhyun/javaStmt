package algoMath; 
import java.util.Scanner; 
/** * @file : DecimalToWhatever.java 
 * * @author KIM HYEHYEON * @date 2016. 3. 19. 
 * * @story 14.10진수를 임의의 진수로 변환하기 
 * * 10진수를 입력 받아 2진수, 8진수, 16진수로 변환해서 출력 
 * * 단, 진수 표시에 사용될 0~9, A, B, C, D, E, F는 A(16) 배열에 저장되어 있다고 가정 
 */
 public class DecimalToWhatever { 
	 /** [문제] 10진수를 입력 받아 2,8,16진수로 변환해서 출력하는 순서도를 작성하시오.
	  *  단, 진수 표시에 사용될 0~9,A,B,C,D,E,F 는 arr[16] 배열에 저장되어 있다고 가정한다
	  *   [변수] arr[] : 0~9,A,B,C,D,E,F 까지 저장되어 있는 
	  *   1차원 배열 jinsu : 변환할 진수의 밑(base)이 저장될 변수. 
	  *   8진수는 8 , 2진수는 2 decimal : 
	  *   10진수가 저장될 변수 power : decimal 에 
	  *   가장 가까운 base 의 누승 mok : decimal 를 
	  *   power 로 나눈 몫 nmg : decimal 를 power 로 나눈 나머지 
	  *   [결과] 변환할 진수와 10진수값을 입력하세요 2 23 10111 * */
	 public static void main(String[] args) { 
		 Scanner scanner = new Scanner(System.in); 
		 String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"}; 
		 System.out.println("변환할 진수와 10진수값을 입력하세요 "); 
		 int jinsu = scanner.nextInt(), decimal = scanner.nextInt(), 
		power = 1, mok, nmg; 
		 while (true) { 
			 if (power <= decimal) 
			 { 
				 power = power * jinsu; continue; 
			 } 
			 else { 
				 break; 
				 } 
			 } 
		 while (true) 
		 { 
			 power = power / jinsu; 
			 mok = decimal / power; 
			 nmg = decimal - mok * power; 
			 System.out.print(arr[mok]); 
			 if (power != 1) 
			 { 
				 decimal = nmg; 
				 continue; 
				 } 
			 else 
			 { 
				 break; 
				 } 
			 } 
		 } 
	 } 
