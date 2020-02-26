package example4;

public class Clock {

	private int hour,minute;

	public Clock(String s) {
		hour = Integer.parseInt(s.split(":")[0]);
		minute = Integer.parseInt(s.split(":")[1]);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public String convert()
	{
		String out = "";
		int tempH = hour % 12;
		out = tempH+":"+minute;
		if(hour>tempH)
			out+=" p.m.";
		else out+=" a.m.";
		
		return out;
	}
	
}
