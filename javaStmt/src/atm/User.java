package atm;

public class User implements Runnable{

	ATM atm;
	String name;
	
	public User(ATM atm, String name) {
		super();
		// 부모의 생성자
		// 부모의 기능을 가져다 쓰기 위해
		// 자식의 생성자 내부에 호출함
		this.atm=atm;
		this.name=name;
	}
	@Override
	public void run() {
		atm.inchul(name);
		
		
	}
	

}
