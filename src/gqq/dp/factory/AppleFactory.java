package gqq.dp.factory;

import gqq.dp.abstractFactory.*;
import gqq.dp.common.*;

public class AppleFactory extends FruitFactory {

	@Override
	public Apple create() {
		return new Apple();
	}
}
