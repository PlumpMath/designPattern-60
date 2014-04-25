package gqq.dp.listener2;

/**
 * 被观察者接口
 * 
 * @author gqq
 * 
 */
public interface Observerable {

	void addObserver(Observer ob);

	void deleteObserver(Observer ob);

	void donotify();
}
