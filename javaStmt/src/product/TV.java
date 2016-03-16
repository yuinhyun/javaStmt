package product;

public class TV extends Product{

	protected String picture, screen;
	
	public void setTVInof(String company, String name, String serialNo,
			String picture, String screen){
		
		super.setProductInfo(company, name, serialNo);
		this.picture=picture;
		this.screen=screen;
		
	}
	@Override
	public String display() {
		
		return "제조회사 : "+ super.company+"\n제품명 : "+ super.name+"\n고유번호 :" + super.serialNo + "\n"
				+ "화질 :"+this.picture+"\n크기 :"+this.screen;
	}

}
