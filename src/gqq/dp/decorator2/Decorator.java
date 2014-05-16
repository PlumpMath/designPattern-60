package gqq.dp.decorator2;

/**
 * 装饰类，它和CentralPerk既是继承关系，也是聚合关系。这是一种特别神奇的关系。<br>
 * 和组合模式特别像
 * 
 * @author gqq
 * 
 */
public abstract class Decorator extends CentralPerk {
	protected CentralPerk coffee;

	public Decorator(CentralPerk coffee) {
		this.coffee = coffee;
	}
}
