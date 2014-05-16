package gqq.dp.decorator2;

/**
 * 牛奶装饰类，多点一份牛奶，多加5块钱
 * 
 * @author gqq
 * 
 */
public class Milk extends Decorator {

	private double price = 5;

	public Milk(CentralPerk coffee) {
		super(coffee);
	}

	@Override
	public double cost() {
		return coffee.cost() + this.price;
	}

}
