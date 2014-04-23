package gqq.dp.template;

import gqq.dp.common.*;

public class HummerH1 extends Hummer {

	private boolean alarmflag;

	public void setAlarmflag(boolean alarmflag) {
		this.alarmflag = alarmflag;
	}

	@Override
	public void start() {
		Out.print("H1 starting..");
	}

	@Override
	public void end() {
		Out.print("H1 ending..");

	}

	@Override
	public void alarm() {
		Out.print("H1 alarming..");

	}

	protected boolean isAlarm() {
		return alarmflag;
	}

}
