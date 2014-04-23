package gqq.dp.simplefactory;

import gqq.dp.common.*;

public class FruitsFactory {

	/**
	 * 该泛型方法返回一个IFruit，传入一个IFruit的类类型。通过反射建造对象。 该方法也可以实现开闭原则
	 * 
	 * @param c
	 * @return
	 */
	public <T extends IFruit> IFruit create(Class<T> c) {

		try {
			return (T) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
