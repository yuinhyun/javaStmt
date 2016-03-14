package ifelse;

public class FirstGrade {
	private String aName, bName,cName, Name;
	private int aScore, bScore, cScore, Score;
	
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getaScore() {
		return aScore;
	}
	public void setaScore(int aScore) {
		this.aScore = aScore;
	}
	public int getbScore() {
		return bScore;
	}
	public void setbScore(int bScore) {
		this.bScore = bScore;
	}
	public int getcScore() {
		return cScore;
	}
	public void setcScore(int cScore) {
		this.cScore = cScore;
	}
	public String getName() {
		return Name;
	}
	public void setName() {
		  int temp =aScore;
		  if(temp==aScore)
		  {
			 this.Name=aName;
		  }
		   
	      if (bScore > temp) {
	         this.Name=bName;
	      } 
	      if(cScore > temp){
	         this.Name=cName;
	      }
	}
	public int getScore() {
		
		
		return Score;
	}
	public void setScore() {
		
		  int temp =aScore;
		   
	      if (bScore > temp) {
	         temp = bScore;
	      } 
	      if(cScore > temp){
	         temp = cScore;
	      }
	      this.Score = temp;
		
		
	}
	@Override
	public String toString() {
		return "1등은? [이름=" + Name + ", 성적=" + Score + "]";
	}
	
	

}
