package algoMath;
/**
 * @file: PrimeCount.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 9.소수의 개수 구하기
 */
public class PrimeCount {
/**
[문제] 
	배열 targets(99)에2~100 사이의 정수를 기억시킨 후
	이 배열을 이용하여 소수의 개수를 구하시오.  
[변수]
	targets : 소수 여부를 판별할 숫자가 저장될 배열
	target : targets 의 요소
	i : 배열의 인덱스
	cnt : 소수의 개수
	m : 소수의 배수(multiple)가 있는 위치값
[결과]
	==========================
	1부터 100사이 소수의 개수 
	==========================
	25 개 
	==========================
*/
	public static void main(String[] args) {
		int[] targets = new int[100];
		int target = 0, i = 0, cnt = 0, m = 0;
		
		while (true) {
			targets[target] = target; // 인덱스 0 때문에
			target++;
			if (target <= 99)
				continue;
			else break;
		}
		/*for (i = 0; i < targets.length; i++) {
			System.out.println("배열요소"+targets[i]);
		}*/
		
		for (i = 2; i <= 99; i++) {
			if (targets[i]==0) {
				continue;
			} else {
				System.out.println("소수 : " + targets[i]);
				cnt++;
				for(m = i+i;m<=99;m+=i){
					targets[m] = 0;
				}
			}
		}
		System.out.printf(
				  "==========================\n"
				+ "1부터 100사이 소수의 개수 \n"
				+ "==========================\n"
				+ "%d 개 \n"
				+ "==========================",cnt);
		
	}

}
