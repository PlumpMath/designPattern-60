package gqq.dp.command;

import java.util.*;


public abstract class Command {
	protected Television tv;

	public Command(Television _tv) {
		tv = _tv;
	}

	public abstract void execute();
}


