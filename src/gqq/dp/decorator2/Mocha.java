package gqq.dp.decorator2;

/**
 * 抹茶装饰类，点一份抹茶，多加7块钱
 * 
 * @author gqq
 * 
 */
public class Mocha extends Decorator {

	private double price = 7;

	public Mocha(CentralPerk coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		return coffee.cost() + this.price;
	}

}
