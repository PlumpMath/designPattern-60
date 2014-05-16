package gqq.dp.decorator2;

public class HouseBlend extends CentralPerk {

	/**
	 * 定义这种咖啡的价格是28元
	 */
	public HouseBlend() {
		this.price = 28;
	}

	@Override
	public double cost() {
		return this.price;
	}

}
