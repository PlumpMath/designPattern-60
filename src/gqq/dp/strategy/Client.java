package gqq.dp.strategy;

public class Client {

	public int getValue(int a, String op, int b) {
		return op.equals("+") ? new Context(new Add()).execute(a, b) : new Context(new SubStract())
				.execute(a, b);
	}
}
