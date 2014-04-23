package gqq.dp.command;

public class RemoteController {
	private Command command;

	public RemoteController() {
	}

	public RemoteController(Command openCommand, Command closeCommand, Command rebootCommand) {
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.rebootCommand = rebootCommand;
	}

	private Command openCommand;
	private Command closeCommand;
	private Command rebootCommand;

	public void open() {
		this.openCommand.execute();
	}

	public void close() {
		this.closeCommand.execute();
	}

	public void reboot() {
		this.rebootCommand.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		command.execute();
	}
}
