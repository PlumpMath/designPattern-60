package gqq.dp.single;


public class Single {

	public static final Single Instance = new Single();

	private Single() {
	}

	public static Single getInstance() {
		return Instance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	private String name = "test string";
}
