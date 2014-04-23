package gqq.dp.abstractFactory;

public abstract class IFactory {
	public abstract Fruit createFruit(String name);

	public abstract Veggie createVeggie(String name);
}
