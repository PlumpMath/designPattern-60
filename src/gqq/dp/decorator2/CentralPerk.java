package gqq.dp.decorator2;

/**
 * 抽象类，相当于Component。Decorator和具体的咖啡都继承自它。
 * 
 * @author gqq
 * 
 */
public abstract class CentralPerk {

	protected double price;

	public abstract double cost();

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
