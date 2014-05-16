package gqq.dp.decorator;

import static org.junit.Assert.*;
import gqq.dp.common.*;

import org.junit.*;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	@Test
	public void NoTitleTailTicket() {
		Component component = new Ticket();
		component.print();
	}

	@Test
	public void Head1Ticket() {
		Component ticket = new Ticket();
		Component decorator = new Header1(ticket);
		decorator.print();
		Out.print("");
		decorator = new Header2(decorator);
		decorator.print();
		Out.print("");
		decorator = new Tail1(decorator);
		decorator.print();
		Out.print("");
	}

	@Test
	public void Output() {
		Component ticket = new Ticket();
		ticket = new Header2(ticket);
		ticket = new Header1(ticket);
		ticket = new Tail1(ticket);
		ticket.print();
	}
}
