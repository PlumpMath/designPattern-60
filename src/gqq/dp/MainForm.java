package gqq.dp;

import com.sun.security.ntlm.*;

import gqq.dp.factory.*;
import gqq.dp.prototype.*;
import gqq.dp.proxy.*;
import gqq.dp.single.*;

public class MainForm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ���Ե���ģʽ
		// String s1 = new String("abc");
		// String s2 = new String("abc");
		// System.out.println(s1 == s2);
		//
		// Single sg1 = Single.getInstance();
		// Single sg2 = Single.getInstance();
		// // �Ƚ�����������ָ�����Ƿ���ͬ��
		// System.out.println(sg1 == sg2);
		// System.out.println(sg1.equals(sg1));
		//
		// System.out.println(sg1 instanceof Single);

		// ���Լ򵥹���ģʽ
		// SimpleFactory cf = new CommonFactory();
		// ICommon apple = cf.create(Apple.class.getName());
		// apple.plant();
		// apple.grow();
		//
		// ICommon grape = cf.create(Grape.class.getName());
		// grape.plant();
		// grape.grow();
		//
		// // ����һ������������Ҫ֪�����Ĺ�����
		// SimpleFactory liuFac = new LiulianFactory();
		// Liulian liulian = (Liulian) liuFac.create("TEST LIULIAN");
		// System.out.println(liulian.getName());
		
		// gqq.dp.simplefactory.Client.testSimpleFactory();
		// gqq.dp.factory.Client.testFactory();
		// gqq.dp.abstractFactory.Client.testFactory();
		// Library.test();
		// gqq.dp.adapter.Client.testAdapter();
		// gqq.dp.bridge.Client.test();
		BookStore.test();

	}

}
