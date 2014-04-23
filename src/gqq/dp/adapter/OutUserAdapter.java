package gqq.dp.adapter;

public class OutUserAdapter implements IUserInfo {

	private IUserBasicInfo basicInfo;
	private IOfficeInfo officeInfo;
	private IHomeInfo homeInfo;

	public OutUserAdapter(IUserBasicInfo basicInfo, IOfficeInfo officeInfo, IHomeInfo homeInfo) {
		this.basicInfo = basicInfo;
		this.officeInfo = officeInfo;
		this.homeInfo = homeInfo;
	}

	@Override
	public String getUserName() {
		return basicInfo.getName().get("name");
	}

	@Override
	public String getUserHome() {
		return homeInfo.getHomeInfo().get("home");
	}

	@Override
	public int getSalary() {
		return basicInfo.getSalary().get("salary");
	}

	@Override
	public String getOfficeInfo() {
		return officeInfo.getOfficeInfo().get("office");
	}

}
