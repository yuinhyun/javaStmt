package grade;

public class GradeBean {
	private String name;
	private int hak, java, sql, jsp, spring;
	public GradeBean() {}//생성자 오버로딩
	
	public GradeBean(int hak, String name, int java, int sql, int jsp, int spring) 
	{
		this.name = name;
		this.hak = hak;
		this.java= java;
		this.sql=sql;
		this.jsp=jsp;
		this.spring=spring;
		
		
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHak() {
		return hak;
	}
	public void setHak(int hak) {
		this.hak = hak;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	@Override
	public String toString() {
		return "성적 [이름=" + name + ", 학번=" + hak + ", java=" + java + ", sql=" + sql + ", jsp=" + jsp
				+ ", spring=" + spring + "]";
	}
	
	

}
