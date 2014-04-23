package gqq.dp.factory;

import gqq.dp.abstractFactory.*;

public class PearFactory extends FruitFactory {

	public Pear create() {
		return new Pear();
	}
}
