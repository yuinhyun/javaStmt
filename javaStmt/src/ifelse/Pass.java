package ifelse;

public class Pass {
	private String name, pass;
	private int java, jsp, sql, spring, total;
	private double avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public String getPass() {
		return pass;
	}
	public void setPass() {
		if (avg>=60) {
			pass = "합격";
		}else
		{
			pass = "불합격";
		}
		this.pass = pass;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java+jsp+sql+spring;;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total/(double)4;;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	@Override
	public String toString() {
		return name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+spring+"\t"+total+"\t"+avg+"\t"+pass;
	}
	
	

}
