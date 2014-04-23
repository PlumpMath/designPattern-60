package gqq.dp.simplefactory;

import gqq.dp.common.*;

public class Apple implements IFruit {

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
