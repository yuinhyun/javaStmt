package ifelse;

public class TimeCalc {
	int wiki, hour, minute, wikipedia;
	String result;

	public int getWiki() {
		return wiki;
	}

	public void setWiki(int wiki) {
		this.wiki = wiki;
	}

	public int getHour() {
		return hour;
	}

	public void setHour() {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute() {
		this.minute = minute;
	}

	public int getWikipedia() {
		return wikipedia;
	}

	public void setWikipedia() {
		this.wikipedia = wikipedia;
	}

	public String getResult() {
		return result;
	}

	public void setResult() {
		if (wiki>=3600) {
			hour = wiki/3600;
			minute= (wiki-(hour*3600))/60;
			wikipedia= wiki-((minute*60)+(hour*3600)) ;
		}
		else if(wiki<3600)
		{
			minute = wiki/60;
			wikipedia= wiki-(minute*60);
		}
		else
		{
			wikipedia= wiki;
		}
		this.result = hour+"시"+ minute +"분"+ wikipedia +"초";
	}

	@Override
	public String toString() {
		return "시간은 [" + result + "]";
	}
	

}
