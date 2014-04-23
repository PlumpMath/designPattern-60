package gqq.dp.simplefactory;

import gqq.dp.common.*;

public class FruitsFactory {

	/**
	 * �÷��ͷ�������һ��IFruit������һ��IFruit�������͡�ͨ�����佨����� �÷���Ҳ����ʵ�ֿ���ԭ��
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
