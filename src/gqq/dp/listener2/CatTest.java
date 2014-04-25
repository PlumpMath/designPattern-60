package gqq.dp.listener2;

import static org.junit.Assert.*;

import org.junit.*;

public class CatTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Main() {
		// fail("Not yet implemented");
		Cat cat = new Cat();
		cat.addObserver(new Mouse());
		cat.addObserver(new Master());
		cat.cry();
	}

}
