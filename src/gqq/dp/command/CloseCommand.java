package gqq.dp.command;

/**
 * 这种实现方式，Receiver（TV）既可以由用户指定，也可以默认。<br>
 * 实在是一种很优秀的方法
 * 
 * @author gqq
 * 
 */
public class CloseCommand extends Command {
	public CloseCommand() {
		super(new Television());
	}

	public CloseCommand(Television _tv) {
		super(_tv);
	}

	@Override
	public void execute() {
		tv.close();
	}
}
