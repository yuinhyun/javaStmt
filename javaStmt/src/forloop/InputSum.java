package forloop;

public class InputSum {
	private int num, sum;

	public int getSum() {
		return sum;
	}

	public void setSum() {
		for (int i = 1; i <=num; i++) 
		{
			this.sum +=i;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "결과 [1부터 " + num +"까지의 " + "합은 "+ sum+"입니다.]";
	}
	
}
