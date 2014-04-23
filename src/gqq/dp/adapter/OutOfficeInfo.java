package gqq.dp.adapter;

import java.util.*;

public class OutOfficeInfo implements IOfficeInfo {


	@Override
	public Map<String, String> getOfficeInfo() {
		Map<String, String> officeMap = new HashMap<String, String>();
		officeMap.put("office", "guomao");
		return officeMap;
	}
}
