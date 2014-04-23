package gqq.dp.factory;

import gqq.dp.common.*;

public class Oriange implements IFruit {
	@Override
	public void plant() {
		Out.print("Oriange is plantling");
	}

	@Override
	public void grow() {

		Out.print("Oriange is growing");
	}

	@Override
	public void harvest() {

		Out.print("Oriange is harvested");
	}

}
