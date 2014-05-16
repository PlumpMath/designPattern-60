package gqq.dp.decorator2;

public class Espresso extends CentralPerk {

	/**
	 * 定义这种咖啡的使用价格是32元
	 */
	public Espresso() {
		this.price = 32;
	}

	@Override
	public double cost() {
		return this.price;
	}

}
