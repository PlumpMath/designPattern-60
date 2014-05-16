package gqq.dp.decorator;

import gqq.dp.common.*;

public class Tail1 extends TicketDecorator {

	public Tail1(Component _comp) {
		super(_comp);
	}

	@Override
	public void print() {
		super.print();
		printTail();
	}

	public void printTail() {
		Out.print("^^^^^^^^^^^^^^^^^^^^  Tail1 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
}
