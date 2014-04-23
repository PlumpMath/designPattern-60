package gqq.dp.abstractFactory;

import gqq.dp.common.*;

public abstract class Pear extends Fruit {
	@Override
	public void plant() {
		Out.print("Pear is plantling");
	}

	@Override
	public void grow() {

		Out.print("Pear is growing");
	}

	@Override
	public void harvest() {

		Out.print("Pear is harvested");
	}

}
