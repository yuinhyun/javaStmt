package forloop;

public class FactorOf5 {
	private int endNum, count, sum;

	public int getEndNum() {
		
		return endNum;
	}

	public void setEndNum(int endNum) {

		this.endNum = endNum;
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		this.count = endNum/5;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		for (int i = 0; i <= endNum; i+=5)
		{
			this.sum +=i;
		}
		
	}

	@Override
	public String toString() {
		return "FactorOf5 [" +"1에서"+ endNum +"까지" + ", 5의 배수 갯수=" + count + ", 5의배수 합=" + sum + "]";
	}
	
}
