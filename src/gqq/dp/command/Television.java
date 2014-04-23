package gqq.dp.command;

import gqq.dp.common.*;

/**
 * 定义Receiver
 * 
 * @author gqq
 * 
 */
public class Television {

	private TvStatus tvStatus;

	public Television() {
		this.tvStatus = TvStatus.Closed;
	}

	public void open() {
		if (tvStatus.equals(TvStatus.Closed)) {
			Out.print("开机……");
			this.tvStatus = TvStatus.Open;
		} else {
			Out.print("已经开机了……");
		}
	}

	public void close() {
		if (tvStatus.equals(TvStatus.Open)) {
			Out.print("关机……");
			this.tvStatus = TvStatus.Closed;
		} else {
			Out.print("已经关机了……");
		}
	}

	public void change() {
		Out.print("换台……");
	}

	/**
	 * @return the tvStatus
	 */
	public TvStatus getTvStatus() {
		return tvStatus;
	}

}

enum TvStatus {
	Open, Closed
}