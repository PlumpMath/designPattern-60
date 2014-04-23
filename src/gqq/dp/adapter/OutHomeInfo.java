package gqq.dp.adapter;

import java.util.*;

public class OutHomeInfo implements IHomeInfo {

	@Override
	public Map<String, String> getHomeInfo() {
		Map<String, String> homeMap = new HashMap<String, String>();
		homeMap.put("home", "my home");
		return homeMap;
	}
}
