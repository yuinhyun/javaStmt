package whileloop;

import java.util.Scanner;

/**
 *@file : NumGolfMain.java 
 *@author inhyeon
 *@date 2016. 3. 10.
 *@story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 *
 */
public class NumGolfMain {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		NumGolfBean bean = new NumGolfBean();
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();
		bean.setCount();
		System.out.println("1부터 10까지 숫자 중 하나 입력");
		
		while(true)
		{
		bean.setPlayer(scanner.nextInt());
		if(bean.getCom()==bean.getPlayer())
		{
			bean.setFlag(true);
			break;
			
		}
		else{
			bean.setCount();
			System.out.println("불일치");
			
			}
		}
		System.out.println(bean.toString());
	}

	private static int getPlayer() {
		// TODO Auto-generated method stub
		return 0;
	}
}
