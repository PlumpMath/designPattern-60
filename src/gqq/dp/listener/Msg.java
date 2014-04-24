package gqq.dp.listener;

import gqq.dp.common.*;

/**
 * 短信平台
 * 
 * @author gqq
 * 
 */
public class Msg {

	private Atm atm;

	public void registerAtm() {
		if (null == atm)
			return;
		atm.addListener(new DrawbackListener() {

			@Override
			public void donotify(DrawbackEvent event) {
				Out.print("短信通知您，你取了" + event.getNumber() + "钱");
			}
		});
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
}
