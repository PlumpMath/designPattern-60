package gqq.dp.listener;

import gqq.dp.common.*;

public class Email implements DrawbackListener {

	@Override
	public void donotify(DrawbackEvent event) {
		Out.print("邮件通知您，你取了" + event.getNumber() + "钱");
	}

	/**
	 * @return the atm
	 */
	public Atm getAtm() {
		return atm;
	}

	/**
	 * @param atm
	 *            the atm to set
	 */
	public void setAtm(Atm atm) {
		this.atm = atm;
	}

	private Atm atm;

	public void registerAtm() {
		if (null != atm)
			atm.addListener(this);
	}
}
