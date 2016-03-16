package product;

public abstract class Product {
	protected String company, name, serialNo;
	public void setProductInfo(String company, String name, String serialNo){
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
		
	}
	public abstract String display();//추상 메서드

}
