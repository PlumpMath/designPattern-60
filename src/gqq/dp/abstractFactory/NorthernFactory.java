package gqq.dp.abstractFactory;

public class NorthernFactory extends IFactory {
	
	private static final String NORTHERN = "gqq.dp.abstractFactory.Northern";

	@Override
	public Fruit createFruit(String name) {

		try {
			return (Fruit) Class.forName(NORTHERN + name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Veggie createVeggie(String name) {
		try {
			return (Veggie) Class.forName(NORTHERN + name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

}
