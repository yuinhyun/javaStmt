package atm;

public class AtmMain {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Runnable hong = new User(atm,"홍길동");//데코레이션 패턴 atm을 줬더니 atm을 사용하더라
		Runnable kim = new User(atm,"김유신");
		Runnable lee = new User(atm,"이순신");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee);
		thr3.start();
	}
}
