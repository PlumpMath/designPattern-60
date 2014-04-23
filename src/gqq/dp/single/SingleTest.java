package gqq.dp.single;

import static org.junit.Assert.*;

import org.junit.*;

public class SingleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetInstance() {
		// fail("Not yet implemented");

		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		assertEquals(s1, s2);
	}

	@Test
	public void testGetName() {
		// fail("Not yet implemented");
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		assertEquals("test string", s1.getName());
		assertEquals(s1.getName(), s2.getName());

	}

	@Test
	public void testSetName() {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		s1.setName("new key");
		assertEquals("new key", s2.getName());

		s2.setName("new2");
		assertEquals(s1.getName(), s2.getName());
		assertNotEquals("new key", s1.getName());
	}

}
