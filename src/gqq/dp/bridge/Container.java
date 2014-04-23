package gqq.dp.bridge;

public abstract class Container {
	protected ContainerImp imp;

	public Container(ContainerImp imp) {
		this.imp = imp;
	}

	public void add() {
		this.imp.addAtPosition(3);
	}

	public void fetch() {
		this.imp.fetchAtPosition(3);
	}

	public abstract void count();
}
