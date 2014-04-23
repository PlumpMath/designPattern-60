package gqq.dp.proxy;

import gqq.dp.common.*;

import java.lang.reflect.*;

public class BookStore {

	public static void test() {
		BookFacade facade = new BookFacadeImpl();

		// ������Ǹ�ʵ���࣬��proxy��Ҫ����Ķ���
		InvocationHandler bkProxy = new BookProxy(facade);

		// �����facade�Ĵ������
		BookFacade proxy = (BookFacade) (Proxy.newProxyInstance(facade.getClass().getClassLoader(),
				facade.getClass().getInterfaces(), bkProxy));
		// ��ʱ��proxy�Ϳ���ִ��addbook��������������facade����һ���ġ�
		Out.print(proxy instanceof BookFacade);
		Out.print(proxy instanceof BookFacadeImpl);
		Out.print(proxy.getClass().getName());

		proxy.addBook();
	}
}

// ����Դ�룬����ģʽ�������������һ������
// class $Proxy0 implements BookFacade {
//
// BookFacade target;
// InvocationHandler t;
//
// @Override
// public void addBook() {
// try {
// t.invoke(target, this.getClass().getMethod("addBook", null), null);
// } catch (Throwable e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }

