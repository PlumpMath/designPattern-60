package gqq.dp.bridge;

import gqq.dp.common.*;

public class Client {

	public static void test() {
		// 一个用链表实现的栈
		Out.print("一个用链表实现的栈");
		Container stack = new Stack(new Chain());
		stack.add();
		stack.fetch();
		Out.print("");
		Out.print("一个用链表实现的队列");
		Container queue = new Queue(new Chain());
		queue.add();
		queue.fetch();
		Out.print("");

		// 如果添加一个数据结构——树。只需要继承Container类，实现Container的方法。则树既可以用链表实现，也可以用数组实现。
	}
}
