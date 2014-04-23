package gqq.dp.strategy;

import static org.junit.Assert.*;

import org.junit.*;

public class ClientTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Client c = new Client();
		assertEquals(c.getValue(3, "+", 4), 7);
		assertEquals(c.getValue(3, "-", 4), -1);
	}

}
