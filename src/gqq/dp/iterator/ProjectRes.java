package gqq.dp.iterator;

import java.util.*;

public class ProjectRes implements IProjectRes {

	private Vector<IProject> vector = new Vector<>();



	@Override
	public void add(IProject project) {
		vector.add(project);
	}

	@Override
	public void remove(int index) {
		vector.remove(index);
	}

	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(vector);
	}

}
