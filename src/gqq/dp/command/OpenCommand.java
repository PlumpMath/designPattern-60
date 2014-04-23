package gqq.dp.command;

public class OpenCommand extends Command {

	public OpenCommand() {
		super(new Television());
	}

	public OpenCommand(Television _tv) {
		super(_tv);
	}

	@Override
	public void execute() {
		tv.open();
	}

}
