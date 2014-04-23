package gqq.dp.factory;

import gqq.dp.common.*;

public abstract class FruitFactory {

	public abstract <T extends IFruit> T create();
}
