package gqq.dp.proxy;

import gqq.dp.common.*;

import java.lang.reflect.*;

public class BookStore {

	public static void test() {
		BookFacade facade = new BookFacadeImpl();

		// 这就是那个实体类，是proxy需要代理的对象
		InvocationHandler bkProxy = new BookProxy(facade);

		// 这就是facade的代理对象
		BookFacade proxy = (BookFacade) (Proxy.newProxyInstance(facade.getClass().getClassLoader(),
				facade.getClass().getInterfaces(), bkProxy));
		// 这时候，proxy就可以执行addbook操作，看起来和facade类是一样的。
		Out.print(proxy instanceof BookFacade);
		Out.print(proxy instanceof BookFacadeImpl);
		Out.print(proxy.getClass().getName());

		proxy.addBook();
	}
}

// 根据源码，代理模式打给生成了这样一种内容
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

