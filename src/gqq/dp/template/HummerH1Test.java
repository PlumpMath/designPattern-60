package gqq.dp.template;

import static org.junit.Assert.*;

import org.junit.*;

public class HummerH1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// fail("Not yet implemented");

		HummerH1 h1 = new HummerH1();
		h1.setAlarmflag(true);
		h1.run();

		assertTrue(h1 instanceof HummerH1);
		assertTrue(h1 instanceof Hummer);
	}

}
