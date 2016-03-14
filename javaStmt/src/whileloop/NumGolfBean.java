package whileloop;

public class NumGolfBean {
	// 플레이어 : 게임참여자가 맞히려고 입력한 값
	// 컴 : 컴퓨터가 랜덤 생성한 값
	// 카운트 : 플레이어가 입력한 횟수
	// 카운트가 작을수록 승리
	int player, com, count;
	boolean flag; // 컴의 숫자와 일치하는지 체크하는 값
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		//1부터 10까지 랜덤 수 발생
		this.com = (int) (Math.random() * 10) + 1;
	}
	public int getCount() {
		return count;
	}
	public void setCount() {
		
		this.count++;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag() {
		this.flag = (getCom()==getPlayer())?true:false;
	}
	public String getResult(){
		return "";
	}
	@Override
	public String toString() {
		return "결과 [플레이어=" + player + ", 컴퓨터값=" + com + ", 시도한 횟수=" + count + ", 일치여부=" + flag + "]";
	}
	
	

}
