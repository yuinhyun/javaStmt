package forloop;

public class InputGugudan {
	private int dan;
	private String err;
	private String result;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		
		if(dan<=0)
		{
			this.dan=dan;
			this.err = "1이상의정수입력";
			this.result ="없음";
			
			return;
		}
		for (int i = dan ; i <= dan; i++) 
		{
				for (int j = 1; j < 10; j++)
				{
					this.dan=dan;
					this.err = "없음";
					this.result = (dan +" * "+ j+ " = "+ dan*j);
					System.out.println(result);
				}
				
		}
		
		this.dan = dan;
	}
	public String getResult() {
		return result;
	}

	public void setResult() {
		
		
		this.result=result;
	}

	public String getErr() {
		return err;
	}

	public void setErr() {	
		this.err = err;
	}

	@Override
	public String toString() {
		return "구구단 [몇단="+ dan + "단"+", 오류=" + err + "]";
		
	}
	
	

}
