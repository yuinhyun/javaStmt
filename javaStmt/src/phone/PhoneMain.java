package phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneMain mm = new PhoneMain();
		// mm.usePhone(scanner); //집전화
		// mm.useNokia(scanner);
		//mm.useIPhone(scanner);
		mm.useAndroid(scanner);
	}

	public  void useAndroid(Scanner scanner) {
		AndroidPhone aPhone = new AndroidPhone();
		//객체 생성하는 자바 방법은 총 3가지가 있음.
		//1. 생성자 ---> 거의 사용되지 않습니다. 스프링 가면 전멸
		//2. Deep Copy => 부모타입으로 정의하면서 추가되는 메소드를 제약하는 문법
		//3. Shallow Copy => MemberBean m = instance.getMember();
		aPhone.setCompany("안드로이드");
		System.out.println(aPhone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ? : 보낼메시지 ?");
		aPhone.setData(scanner.next(), scanner.next(),"13인치");
		System.out.println(aPhone.getData());
	}

	public  void useIPhone(Scanner scanner) {
		Iphone iPhone = new Iphone();
		iPhone.setCompany("아이폰");
		System.out.println(iPhone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ? : 보낼메시지 ? : 사용하는 핸드폰 사이즈");
		iPhone.setData(scanner.next(), scanner.next());
		System.out.println(iPhone.getData());
	}

	public  void useNokia(Scanner scanner) {
		System.out.println("=== 핸드폰으로 전화 ===");
		Phone nokia = new CelPhone();//Deep Copy
		//부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할수 있다.
		nokia.setCompany("Nokia");
		System.out.println(nokia.getCompany() + "를 사용");
		System.out.println("핸드폰으로 전화할 사람 ?");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
	}

	public  void usePhone(Scanner scanner) {
		System.out.println("=== 집 전화기로 통화 ===");
		Phone hphone = new Phone();
		hphone.setCompany("삼성전자 집 전화기");
		System.out.println(hphone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ?");
		hphone.setCall(scanner.next());
		System.out.println(hphone.getCall());
	}

}