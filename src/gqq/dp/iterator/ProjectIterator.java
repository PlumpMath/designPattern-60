package gqq.dp.iterator;

import java.util.*;

public class ProjectIterator implements IProjectIterator {

	private Vector<IProject> projects = new Vector<IProject>();
	//
	private int current;

	public ProjectIterator(Vector<IProject> projects) {
		this.projects = projects;
	}

	@Override
	public boolean hasNext() {
		if (this.projects.size() == 0 || current == this.projects.size())
			return false;
		return true;
	}

	@Override
	public IProject next() {
		return projects.get(current++);
	}

	@Override
	public void remove() {
		projects.remove(current);
	}


}
