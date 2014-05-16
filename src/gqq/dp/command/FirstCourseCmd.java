package gqq.dp.command;

public class FirstCourseCmd extends MicroCommand {

	public FirstCourseCmd(Television _tv) {
		super(_tv);
	}

	@Override
	public void attach(Command cmd) {
		if (!this.commands.contains(cmd))
			commands.add(cmd);
	}

	@Override
	public void dettach(Command cmd) {
		if (this.commands.contains(cmd))
			commands.remove(cmd);
	}

	@Override
	public void execute() {
		for (Command cmd : commands) {
			cmd.execute();
		}
	}

}
