package gqq.dp.bridge;

import gqq.dp.common.*;

public class Stack extends Container {

	public Stack(ContainerImp imp) {
		super(imp);
	}

	@Override
	public void count() {
		Out.print("��ջ��������㣡");
	}

	@Override
	public void add() {
		super.add();
		Out.print("���Ԫ�ص�ջ��");
	}

	@Override
	public void fetch() {
		super.fetch();
		Out.print("��ջ����Ԫ�����������ɾ��ջ��Ԫ�ء�");
	}
}
