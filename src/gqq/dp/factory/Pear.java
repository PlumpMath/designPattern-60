package gqq.dp.factory;

import gqq.dp.common.*;

public class Pear implements IFruit {
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
