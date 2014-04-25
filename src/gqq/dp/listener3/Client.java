package gqq.dp.listener3;

import static org.junit.Assert.*;

import org.junit.*;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Cat cat = new Cat();
		// cat.addObserver(new Master());
		// cat.addObserver(new Mouse());
		cat.cry();
		cat.setChanged();

		ObserverGqq ob = new ObserverGqq(cat, new Master(), new Mouse());
		ob.start();
	}

}
