package gqq.dp.abstractFactory;

import gqq.dp.common.*;

public class Client {
	public static void testFactory() {

		NorthernFactory nf = new NorthernFactory();
		Fruit northernapple = nf.createFruit("Apple");

		northernapple.plant();
		Out.print(northernapple.getPlace());

		Veggie nortoma = nf.createVeggie("Tomato");
		Out.print(nortoma.getName());
		Out.print(nortoma.getPlace());

		TropicalFactory tf = new TropicalFactory();

		Veggie trtoma = tf.createVeggie("Tomato");
		Out.print(trtoma.getName());
		Out.print(trtoma.getPlace());
	}

}
