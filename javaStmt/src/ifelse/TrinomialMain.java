package ifelse;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Trinomial bean = new Trinomial();
		Scanner s = new Scanner(System.in);
		System.out.println("이름, 국어, 영어, 수학 점수입력");
	
		bean.setName(s.next());
		bean.setKor(s.nextInt());
		bean.setEng(s.nextInt());
		bean.setMath(s.nextInt());
		bean.setAvg();
		bean.setResult();
		
		
		
		System.out.println(bean.toString());
	}

}
