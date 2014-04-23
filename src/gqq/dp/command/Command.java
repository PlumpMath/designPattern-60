package gqq.dp.command;



public abstract class Command {
	protected Television tv;

	public Command(Television _tv) {
		tv = _tv;
	}

	public abstract void execute();
}


