package gqq.dp.command;

import java.util.*;

/**
 * 实现组合模式
 * 
 * @author gqq
 * 
 */
public abstract class MicroCommand extends Command {

	public MicroCommand(Television _tv) {
		super(_tv);
	}

	// 组合模式，聚合关系
	protected ArrayList<Command> commands = new ArrayList<Command>();

	public abstract void attach(Command cmd);

	public abstract void dettach(Command cmd);
}
