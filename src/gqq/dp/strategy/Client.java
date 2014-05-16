package gqq.dp.strategy;

public class Client {

	/**
	 * 这段代码指出，Client需要关心具体的策略。
	 * 
	 * @param a
	 * @param op
	 * @param b
	 * @return
	 */
	public int getValue(int a, String op, int b) {
		return op.equals("+") ? new Context(new Add()).execute(a, b) : new Context(new SubStract())
				.execute(a, b);
	}
}
