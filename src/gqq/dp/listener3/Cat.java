package gqq.dp.listener3;

import gqq.dp.common.*;

import java.util.*;

public class Cat extends Observable {

	public void cry() {
		Out.print("喵喵咪……");
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public synchronized void setChanged() {
		// TODO Auto-generated method stub
		super.setChanged();
	}

	@Override
	public synchronized void clearChanged() {
		// TODO Auto-generated method stub
		super.clearChanged();
	}
}
