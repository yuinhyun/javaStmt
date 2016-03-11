package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args)
	{
		//지역변수 영역
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl service = new BankServiceImpl();
		AdminBankServiceImpl admin = new AdminBankServiceImpl(100);
		
		
		//연산
		System.out.println("이름, 비번 입력");
		System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
		System.out.println("입금액을 입력하세요");
		System.out.println(service.deposit(scanner.nextInt()));
		
		
		
		
	}

}
