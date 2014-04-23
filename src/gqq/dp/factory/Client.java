package gqq.dp.factory;

import gqq.dp.common.*;

public class Client {

	public static void testFactory() {

		// 先建造一个新的工厂
		IFruit apple = new AppleFactory().create();
		IFruit pear = new PearFactory().create();
		IFruit strawberry = new StrawberryFactory().create();

		apple.grow();
		pear.harvest();
		strawberry.plant();
	}
}
