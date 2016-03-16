package product;

public class SmartPhone extends Product{
	protected String camera, size;
	
	public void setSmartPhoneInfo(String company, String name, String serialNo,
								String camera, String size){
		
		super.setProductInfo(company, name, serialNo);
		this.camera =camera;
		this.size = size;
	}

	@Override
	public String display() {
		
		return "제조회사 : "+ super.company+"\n제품명 : "+ super.name+"\n고유번호 :" + super.serialNo + "\n"
				+ "카메라 :"+this.camera+"\n크기 :"+this.size;
	}

	

}
