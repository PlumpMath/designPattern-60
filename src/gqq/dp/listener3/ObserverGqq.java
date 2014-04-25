package gqq.dp.listener3;

import gqq.dp.common.*;

public class ObserverGqq extends Thread {
	Cat cat;
	Master master;
	Mouse mouse;

	public ObserverGqq(Cat cat, Master master, Mouse mouse) {
		this.cat = cat;
		this.master = master;
		this.mouse = mouse;
	}

	@Override
	public void run() {
		while (true) {
			try {
				if (cat.hasChanged()) {
					master.update(null, null);
					mouse.update(null, null);
					cat.clearChanged();
				} else {
					Out.print("猫没有动……");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
