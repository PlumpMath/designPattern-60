package gqq.dp.proxy;

import gqq.dp.common.*;

import java.lang.reflect.*;

public class BookProxy implements InvocationHandler {

	public Object target;

	public BookProxy(Object obj) {
		this.target = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Out.print("before...");

		Object obj = method.invoke(target, args);

		Out.print("after...");
		return obj;
	}

}
