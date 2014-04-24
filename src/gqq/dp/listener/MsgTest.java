package gqq.dp.listener;

import static org.junit.Assert.*;
import gqq.dp.common.*;

import org.junit.*;

public class MsgTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
		Atm atm = new Atm();
		Msg msg = new Msg();
		Email email = new Email();
		msg.setAtm(atm);
		email.setAtm(atm);
		msg.registerAtm();
		email.registerAtm();

		atm.addListener(new DrawbackListener() {
			@Override
			public void donotify(DrawbackEvent event) {
				if (event.getNumber() >= 1000) {
					Out.print("用户控制台通知您，你取了" + event.getNumber() + "钱");
				}
			}
		});
		atm.drawback(1300);
	}

}
