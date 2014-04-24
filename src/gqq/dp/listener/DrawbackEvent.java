package gqq.dp.listener;

import java.util.*;

public class DrawbackEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrawbackEvent(Object source) {
		super(source);
	}

	/**
	 * @return the number
	 */
	public double getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(double number) {
		this.number = number;
	}

	private double number;
}
