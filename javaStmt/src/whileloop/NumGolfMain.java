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
		while(true)
		{
		System.out.println("[메뉴]1.숫자 맞추기 2.종료");
		int key = scanner.nextInt();
		
		switch (key) 
		{
		case 1:
			System.out.println("1부터10까지 숫자중 하나 입력해주세요");
			bean.setPlayer(scanner.nextInt());
			//bean.setCount();
			//String msg="";
			//msg =(bean.getCom()==bean.getPlayer())?bean.toString():"랜덤숫자와 불일치";
			if(bean.getCom()==bean.getPlayer())
			{
				bean.setFlag(true);
				System.out.println("일치");
				System.out.println(bean.toString());
				break;
			}
			else
			{	bean.setCount();
				System.out.println("불일치");
				
			}
			break;
		case 2: System.out.println("종료합니다."); return;
		default: System.out.println("잘못된값");
			break;
		}
	}
		
}

	private static int getPlayer() {
		// TODO Auto-generated method stub
		return 0;
	}
}
