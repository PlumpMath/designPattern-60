package gqq.dp.command;

public class RebootCommand extends Command {

	public RebootCommand() {
		super(new Television());
	}

	public RebootCommand(Television _tv) {
		super(_tv);
	}

	@Override
	public void execute() {
		tv.close();
		tv.open();
	}

}
