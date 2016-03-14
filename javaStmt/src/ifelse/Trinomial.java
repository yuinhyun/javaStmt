package ifelse;

public class Trinomial {
	private int kor, eng, math, avg;
	private String name, result;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult() {
		this.result =(avg>=60) ? "합격": "불합격";
		
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor =kor;
	
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getAvg() {
		return avg;
		
	}

	public void setAvg() {
		this.avg = (int)((kor+eng+math)/3);
	}

	@Override
	public String toString() {
		return "합격발표 [국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 평균=" + avg + ", 이름=" + name
				+ ", 결과=" + result + "]";
	}

	
	
	

}
