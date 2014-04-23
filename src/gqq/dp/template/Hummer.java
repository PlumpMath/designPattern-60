package gqq.dp.template;

/**
 * 这就是模板方法模式，将基本方法有子类实现。模板方法调用子类方法，由父类实现。<br>
 * 
 * 
 * @author gqq
 * 
 */
public abstract class Hummer {

	public abstract void start();

	public abstract void end();

	public abstract void alarm();

	public void run() {
		start();
		if (isAlarm())
			alarm();
		end();
	}

	protected boolean isAlarm() {
		return true;
	}
}
