package gqq.dp.strategy;

public class Context {
	private Calculate calculate;

	public Context(Calculate calculate) {
		this.calculate = calculate;
	}

	public int execute(int a, int b) {
		return calculate.exec(a, b);
	}
}
