package gqq.dp.bridge;

import gqq.dp.common.*;

public class Chain implements ContainerImp {

	@Override
	public boolean addAtPosition(int pos) {
		Out.print("it is easy");
		return true;
	}

	@Override
	public Object fetchAtPosition(int pos) {
		Out.print("it is hard");
		return true;
	}

}
