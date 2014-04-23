package gqq.dp.bridge;

import gqq.dp.common.*;

public class Stack extends Container {

	public Stack(ContainerImp imp) {
		super(imp);
	}

	@Override
	public void count() {
		Out.print("弹栈，逐个计算！");
	}

	@Override
	public void add() {
		super.add();
		Out.print("添加元素到栈顶");
	}

	@Override
	public void fetch() {
		super.fetch();
		Out.print("把栈顶的元素输出，并且删除栈顶元素。");
	}
}
