package gqq.dp.abstractFactory;

import static org.junit.Assert.*;

import org.junit.*;

public class TropicalFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateFruit() {
		// fail("Not yet implemented");
		TropicalFactory tf = new TropicalFactory();
		Fruit apple = tf.createFruit("Apple");
		assertTrue(apple instanceof Apple);
		assertTrue(apple instanceof TropicalApple);
		assertFalse(apple instanceof NorthernApple);
	}

	@Test
	public void testCreateVeggie() {
		// fail("Not yet implemented");
		TropicalFactory tf = new TropicalFactory();
		// Veggie apple = tf.createVeggie("Apple");
		// assertNull(apple);
		Veggie tomato = tf.createVeggie("Tomato");
		assertTrue(tomato instanceof Tomato);
		assertTrue(tomato instanceof TropicalTomato);
		assertFalse(tomato instanceof NorthernTomato);
	}

}
