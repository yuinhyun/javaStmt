package ifelse;

public class LeapYear {
	int year;
	String yearStr;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getYearStr() {
		return yearStr;
	}
	public void setYearStr() {
		if(year %4==0 && year%100 !=0 || year%400==0)//4로 나눠 떨어진다.
		{
			yearStr = "윤년";
			
		}
		else
		{
			yearStr = "평년";
		}
		System.out.println(yearStr+"입니다.");
		
		this.yearStr = yearStr;
	}
	@Override
	public String toString() {
		return "결과 [년도 : " + year + ", 확인=" + yearStr + "]";
	}
	
	
	
}
