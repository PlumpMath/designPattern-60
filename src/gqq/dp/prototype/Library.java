package gqq.dp.prototype;

import gqq.dp.common.*;

import java.util.*;

public class Library implements Cloneable {

	private String name;
	private int number;

	public Library() {
		Out.print("constructor...");
	}

	private ArrayList<String> lstBooks = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBooks(String book) {
		lstBooks.add(book);
	}

	public ArrayList<String> getBooks() {
		return lstBooks;
	}

	@Override
	protected Library clone() {
		try {
			// 默认情况下，super的克隆是浅拷贝
//			return (Library) super.clone();
			//如果是深拷贝，可以对每个元素进行拷贝
			Library lib=new Library();
			lib.setName(this.getName());
			lib.setNumber(this.getNumber());
			// lib.setBooks(this.getBooks());
			for (String book : this.getBooks()) {
				lib.setBooks(book);
			}
			return lib;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void test() {
		Library lib = new Library();
		Library lib2 = lib.clone();
		Out.print(lib == lib2);
		Out.print(lib.equals(lib2));
		lib.setNumber(1);
		lib2.setNumber(2);
		Out.print(lib.getNumber());
		Out.print(lib2.getNumber());

		lib.setBooks("book1");
		lib.setBooks("book2");
		Library lib3 = lib.clone();
		lib3.setBooks("book3");

		for (String book : lib2.getBooks()) {
			Out.print(book);
		}
		for (String book : lib3.getBooks()) {
			Out.print(book);
		}
	}


}

