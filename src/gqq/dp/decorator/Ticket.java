package gqq.dp.decorator;

import gqq.dp.common.*;

/**
 * 实现抽象类的具体类。
 * 
 * @author gqq
 * 
 */
public class Ticket extends Component {

	@Override
	public void print() {
		Out.print("支票的正文是……xxxxxxxxxxxxxxx");
	}

}
