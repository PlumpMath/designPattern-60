package gqq.dp.adapter;

import gqq.dp.common.*;

public class Client {

	public static void testAdapter() {
		IUserInfo uInfo = new UserInfo();
		Out.print(uInfo.getUserName());
		Out.print(uInfo.getOfficeInfo());
		Out.print(uInfo.getSalary());
		Out.print(uInfo.getUserHome());

		IUserInfo ouInfo = new OutUserAdapter(new OutUserBasicInfo(), new OutOfficeInfo(),
				new OutHomeInfo());
		Out.print(ouInfo.getUserName());
		Out.print(ouInfo.getOfficeInfo());
		Out.print(ouInfo.getSalary());
		Out.print(ouInfo.getUserHome());

	}
}
