package gqq.dp.iterator;

import static org.junit.Assert.*;
import gqq.dp.common.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.*;

import org.junit.*;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ClientMain() {
		// IProjectRes project = new ProjectRes("zhangsan", 3, 2.25);
		// project.add(project);
		IProjectRes res = new ProjectRes();

		res.add(new Project("zhangsan", 33, 22.22));
		res.add(new Project("lisi", 323, 232.22));
		res.add(new Project("wangwu", 333, 22.222));
		res.add(new Project("liuliu", 373, 722.22));
		res.add(new Project("yangwu", 333, 6622.22));

		IProjectIterator iterator = res.iterator();
		while (iterator.hasNext()) {
			Out.print(iterator.next());
		}
	}

}
