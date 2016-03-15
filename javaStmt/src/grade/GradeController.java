package grade;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		while(true){
		System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("학번,이름,자바,SQL,JSP,스프링");
			
			service.input(new GradeBean(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
			break;
		case 2:
			service.update();
			break;
		case 3:
			service.delete();
			break;
		case 4:
			
			System.out.println(service.getList());
			break;
		case 5:
			service.getCountByName();
			break;
		case 6:
			service.getGradeByHak();
			break;
		case 7:
			service.getCount();
			break;
		case 0:
			return;
		default: System.out.println("잘못된값");
			return;
			}
		}
	}
}
