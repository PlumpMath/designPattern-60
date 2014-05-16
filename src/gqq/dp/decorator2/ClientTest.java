package gqq.dp.decorator2;

import static org.junit.Assert.*;
import gqq.dp.common.*;

import org.junit.*;

public class ClientTest {

	private static final double DELTA = 1e-15;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void OnlyCoffee() {
		Out.print("only coffee");
		CentralPerk house = new HouseBlend();
		Out.print(house.cost());
		// assertThat(actual, matcher)
		assertEquals(28.0, house.cost(), DELTA);
		CentralPerk espresso = new Espresso();
		assertEquals(32.0, espresso.cost(), DELTA);
	}

	@Test
	public void withMilk() {
		Out.print("only coffee");
		CentralPerk house = new HouseBlend();
		house = new Milk(house);
		house = new Milk(house);
		house = new Mocha(house);
		assertEquals(28 + 5 + 5 + 7, house.cost(), DELTA);
	}
}
