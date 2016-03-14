package ifelse;

public class Gender {
	private String name , ssn, people;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople() {
		char flag =ssn.charAt(7);
		if(flag=='1'||flag=='3') {
			
			people = "남자";
		}
		else if(flag=='2'||flag=='4'){
			people = "여자";
		}
		else if(flag=='5'||flag=='6'){
			people = "외국인";
		}
		else{
			people = "잘못된 주민번호";
		}
		this.people = people;
	}

	@Override
	public String toString() {
		return "결과 [이름=" + name + ", 성별=" + people + "]";
	}
	
	
	
}
