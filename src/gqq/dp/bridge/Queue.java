package gqq.dp.bridge;

import gqq.dp.common.*;

public class Queue extends Container {

	public Queue(ContainerImp imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		Out.print("队列，逐个元素计算");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		super.add();
		Out.print("添加到队尾");
	}

	@Override
	public void fetch() {
		// TODO Auto-generated method stub
		super.fetch();
		Out.print("从队首开始取");
	}

}
