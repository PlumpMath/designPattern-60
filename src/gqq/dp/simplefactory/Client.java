package gqq.dp.simplefactory;

import gqq.dp.common.*;

public class Client {

	public static void testSimpleFactory() {

		// �Ƚ���һ���µĹ���
		FruitsFactory factory = new FruitsFactory();
		IFruit apple = factory.create(Apple.class);
		IFruit oriange = factory.create(Oriange.class);
		IFruit pear = factory.create(Pear.class);

		apple.grow();
		oriange.grow();
		pear.harvest();
	}
}
