package phone;

public class CelPhone extends Phone {
	private boolean portable;
	private String move;


	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		this.portable = portable;
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String getCall() {
		this.setPortable(true);
		return super.getCall()+" "+this.getMove();
	}
}