package gqq.dp.proxy;

import gqq.dp.common.*;

public class BookFacadeImpl implements BookFacade {

	@Override
	public void addBook() {
		Out.print("图书馆中添加了一本书！！");
	}

}
