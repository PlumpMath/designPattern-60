package gqq.dp.listener2;

import static org.junit.Assert.*;
import gqq.dp.common.*;

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
		cat.addObserver(new Observer() {
			
			@Override
			public void update() {
				Out.print("ce shi");
				
			}
		});
		cat.cry();
	}

}
