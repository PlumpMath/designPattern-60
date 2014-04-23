package gqq.dp.adapter;

import java.util.*;

public class OutUserBasicInfo implements IUserBasicInfo {

	@Override
	public Map<String, String> getName() {
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("name", "zhangsan");
		return nameMap;
	}

	@Override
	public Map<String, Integer> getSalary() {
		Map<String, Integer> salaryMap = new HashMap<String, Integer>();
		salaryMap.put("salary", 10000);
		return salaryMap;
	}
}
