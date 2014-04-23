package gqq.dp.factory;

import gqq.dp.common.*;

public class Strawberry implements IFruit {

	@Override
	public void plant() {
		Out.print("Strawberry is plantling");
	}

	@Override
	public void grow() {

		Out.print("Strawberry is growing");
	}

	@Override
	public void harvest() {

		Out.print("Strawberry is harvested");
	}

}
