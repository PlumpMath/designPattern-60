package gqq.dp.decorator;

import gqq.dp.common.*;

public class Header1 extends TicketDecorator {

	public Header1(Component _comp) {
		super(_comp);
	}

	@Override
	public void print() {
		printHeader();
		super.print();
	}

	public void printHeader() {
		Out.print("************************Header1**************************");
	}
}
