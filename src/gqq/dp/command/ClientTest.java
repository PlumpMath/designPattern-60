package gqq.dp.command;

import static org.junit.Assert.*;
import gqq.dp.common.*;

import org.junit.*;

public class ClientTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ClientMain() {
		Television tv = new Television();
		Command opcmd = new OpenCommand(tv);
		Command clcmd = new CloseCommand(tv);
		Command recmd = new RebootCommand(tv);
		RemoteController controller = new RemoteController();
		controller.setCommand(opcmd);
		controller.action();
		Out.print("");

		controller.setCommand(recmd);
		controller.action();
		Out.print("");

		controller.setCommand(clcmd);
		controller.action();
		Out.print("");

		RemoteController controller2 = new RemoteController(opcmd, clcmd, recmd);
		controller2.open();
		controller2.reboot();
		controller2.close();

	}

	@Test
	public void TestMicro() {
		Television tv = new Television();
		Command opcmd = new OpenCommand(tv);
		Command clcmd = new CloseCommand(tv);
		Command recmd = new RebootCommand(tv);

		MicroCommand cmd = new FirstCourseCmd(tv);
		cmd.attach(opcmd);
		cmd.attach(clcmd);
		cmd.attach(recmd);
		cmd.execute();
	}

}
