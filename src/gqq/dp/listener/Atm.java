package gqq.dp.listener;

import gqq.dp.common.*;

import java.util.*;

public class Atm {
	private ArrayList<DrawbackListener> listeners = new ArrayList<>();

	public void addListener(DrawbackListener listener) {
		if (!listeners.contains(listener))
			listeners.add(listener);
	}

	public void removeListener(DrawbackListener listener) {
		if (listeners.contains(listener))
			listeners.remove(listener);
	}

	public void drawback(double num) {
		if (num < 100)
			return;

		DrawbackEvent event = new DrawbackEvent(this);
		event.setNumber(num);

		if (listeners.size() > 0)
			for (DrawbackListener listener : listeners) {
				listener.donotify(event);
			}
		else
			Out.print("似乎没有人注册通知哦！");
	}
}
