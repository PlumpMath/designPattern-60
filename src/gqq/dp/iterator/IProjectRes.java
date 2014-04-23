package gqq.dp.iterator;

public interface IProjectRes {

	// 添加一个IProject
	void add(IProject project);

	void remove(int index);

	// 获得一个迭代器
	IProjectIterator iterator();
}
