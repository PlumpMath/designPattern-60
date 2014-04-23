package gqq.dp.abstractFactory;


public class TropicalFactory extends IFactory {
	private static final String TROPICAL = "gqq.dp.abstractFactory.Tropical";

	@Override
	public Fruit createFruit(String name) {

		try {
			return (Fruit) Class.forName(TROPICAL + name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Veggie createVeggie(String name) {
		try {
			return (Veggie) Class.forName(TROPICAL + name).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
