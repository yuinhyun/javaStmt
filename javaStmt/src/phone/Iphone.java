package phone;


public class Iphone extends CelPhone {
	private String data;
	public static String BRAND = "아이폰"; // 브랜드명은 안바뀐다.
	public static boolean TRUE = true;
	// 아이폰은 집접화기는 생산하지 않는다

	public String getData() {
		return data;
	}

	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = super.getCompany() + "\t" + super.isPortable() + "\t\t" + super.getCall() + "\t\t" + data
				+ " : Message";
	}
}