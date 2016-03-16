package phone;


// Phone은 상속을 시킬 클래스
public class Phone {
	private String company, call;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}

	

}