package gqq.dp.bridge;

import gqq.dp.common.*;

public class Client {

	public static void test() {
		// һ��������ʵ�ֵ�ջ
		Out.print("һ��������ʵ�ֵ�ջ");
		Container stack = new Stack(new Chain());
		stack.add();
		stack.fetch();
		Out.print("");
		Out.print("һ��������ʵ�ֵĶ���");
		Container queue = new Queue(new Chain());
		queue.add();
		queue.fetch();
		Out.print("");

		// ������һ�����ݽṹ��������ֻ��Ҫ�̳�Container�࣬ʵ��Container�ķ����������ȿ���������ʵ�֣�Ҳ����������ʵ�֡�
	}
}
