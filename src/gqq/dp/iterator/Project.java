package gqq.dp.iterator;

public class Project implements IProject {
	public Project(String name, int num, double cost) {
		this.name = name;
		this.number = num;
		this.cost = cost;
	}

	private String name;
	private double cost;
	private int number;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[name:" + name + " number:" + number + " cost:" + cost + "]";
	}
}
