package gqq.dp.abstractFactory;

import gqq.dp.common.*;

public abstract class Tomato extends Veggie {

	@Override
	public void plant() {

		Out.print("tomato is planting");
	}

	@Override
	public String getName() {
		return Tomato.class.getName();
	}

}
