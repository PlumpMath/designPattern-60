package gqq.dp.adapter;

import gqq.dp.common.*;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		Out.print("getusername");
		return "zhangsan";
	}

	@Override
	public String getUserHome() {
		Out.print("getUserHome");
		return "beijing";
	}

	@Override
	public int getSalary() {
		Out.print("salary");
		// Out.print(10000);
		return 10000;
	}

	@Override
	public String getOfficeInfo() {
		Out.print("officeinfo");
		return "office1";
	}

}
