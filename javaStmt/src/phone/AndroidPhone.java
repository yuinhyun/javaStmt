package phone;


public class AndroidPhone extends Iphone {
	public static String BRAND = "안드로이폰"; // 오버라이딩
	private String size;
	private String data; // 부모클래스의 프로퍼티와 동일하게 선언

	public String getSize() {
		return size;
	}

	public String getData() {
		return data;
	}

	// 오버 로딩
	public void setData(String name,String data, String size) {
		this.data = data;
		this.size = size;
		super.setCompany(BRAND); // 오버 라이딩
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = "대화면 " + this.getSize() + "\t" + super.getCompany() + "\t" + super.isPortable() + "\t"
				+ super.getCall() + "\t" + data + " :KaKao Talk";
	}

}