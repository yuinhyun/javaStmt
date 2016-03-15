package bank;

import java.util.Scanner;
import java.util.Vector;

public class AdminController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AdminBankServiceImpl service = new AdminBankServiceImpl();
		while(true)
		{
			System.out.println("[메뉴]1.개설 2.목록 3.조회(계좌번호) 4.조회(이름) 5.계좌수 6.계좌해지 0.종료");
			switch (scanner.nextInt()) {
			case 1: 
				System.out.println("이름, 비밀번호");
				service.openAccount(scanner.next(), scanner.nextInt());
					break;
			
			case 2:
					System.out.println(service.getList());
			case 3:
				break;
			
			case 4:
				break;
			
			case 5:
				break;
				
			case 6:
				break;
			
			case 0:
				return;
			default:
				break;
			}
			
			
		}
		
		
	}

}
