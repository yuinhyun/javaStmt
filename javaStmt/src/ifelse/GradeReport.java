package ifelse;

public class GradeReport {
	private String name, record, subject;
	private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord() {
		if (grade>=90&&grade<=100) {
			record = "A";
		}
		else if (grade>=80&&grade<90) {
			record = "B";
		}
		else if (grade>=70&&grade<80) {
			record = "C";
		}
		else if (grade>=60&&grade<70) {
			record = "D";
		}
		else if (grade>=50&&grade<60) {
			record = "E";
		}
		else if (grade<50&&grade>=0) {
			record = "F";
		}
		else
		{
			record ="점수를 잘못입력하셨습니다.";
		}
		this.record = record;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "학점계산 [이름=" + name + ", 학점=" + record + ", 과목=" + subject + ", 성적=" + grade + "]";
	}
	
	

}
