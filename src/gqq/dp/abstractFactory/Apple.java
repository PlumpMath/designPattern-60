package gqq.dp.abstractFactory;

import gqq.dp.common.*;

public abstract class Apple extends Fruit {
	@Override
	public void plant() {
		Out.print("apple is plantling");
	}

	@Override
	public void grow() {

		Out.print("apple is growing");
	}

	@Override
	public void harvest() {

		Out.print("apple is harvested");
	}
}
