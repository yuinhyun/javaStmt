package whileloop;

import java.util.Scanner;

public class InfiniteLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result=0;
		//(true)주면 무한
		while (true) {
			System.out.println("1.정수를 입력 2.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("출력할 정수값 입력");
				result=scanner.nextInt(); break;
			case 2:
				System.out.println("종료합니다.");
				return;
			default: System.out.println("잘못된 값");
			break;
			}
			System.out.println(result+"입니다.");
			
		}
		
	}

}
