package ifelse;

import java.util.Scanner;

public class Kaup 
{
	//속성영역 : field
	private String name;
	private int Kaup;
	private double height, weight;
	String result;
	//i= (int) ((weight/(height*height))*10000);
	

	// ALT SHIFT S R
	//기능영역 : area
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getKaup() {
		
		return Kaup;
	}

	public void setKaup() {
		this.Kaup = (int) ((weight/(height*height))*10000);
	}

	public String getResult() {
		
		return result;
	}

	public void setResult() {
		setKaup();
		String temp ="";
		if(Kaup>30){
			temp ="비만";	
		}
		else if (Kaup>=24) {
			temp ="과체중";	
		}
		else if (Kaup>=20) {
			temp ="정상";
		}
		else if(Kaup>=15){
			temp ="저체중";
		}
		else if(Kaup>=13){
			temp ="마름";
		}
		else if(Kaup>=10){
			temp ="영양실조";
		}
		else{
			temp ="소모중";
		}
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "카우푸지수 [이름=" + name + ", 결과 ="+ result + "]";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
