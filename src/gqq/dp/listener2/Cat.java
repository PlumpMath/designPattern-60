package gqq.dp.listener2;

import gqq.dp.common.*;

import java.util.*;

/**
 * 这里，我们用了自己的Observer和Observerable。<br>
 * 熟悉了一下观察者模式的定义过程<br>
 * 猫属于subject，是被观察者。
 * 
 * @author gqq
 * 
 */
public class Cat implements Observerable {

	private Vector<Observer> observers = new Vector<>();

	@Override
	public void addObserver(Observer ob) {
		if (!observers.contains(ob))
			observers.add(ob);
	}

	@Override
	public void deleteObserver(Observer ob) {
		if (observers.contains(ob))
			observers.remove(ob);
	}

	@Override
	public void donotify() {
		if (observers.size() > 0)
			for (Observer observer : observers) {
				observer.update();
			}
		else
			Out.print("似乎没有注册观察者哦！");

	}

	/**
	 * 猫的方法，表示叫
	 */
	public void cry() {
		Out.print("喵喵咪……");
		// 通知观察者
		donotify();
	}
}
