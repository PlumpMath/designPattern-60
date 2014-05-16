package gqq.dp.decorator;

public class TicketDecorator extends Component {
	private Component component;

	public TicketDecorator(Component _comp) {
		component = _comp;
	}

	@Override
	public void print() {
		component.print();
	}

}
