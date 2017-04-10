package behavior.observer;

/**
 * 被观察者（主题）
 * 定义被观察者必须实现的职责，它必须能动态地增加，取消观察者
 * 管理并通知观察者
 * @author wanghaiyong
 *
 */
public interface Subject {

	/**
	 * 添加观察者
	 * @param observer
	 */
	void attach(Observer observer);
	
	/**
	 * 移除观察者
	 * @param observer
	 */
	void detach(Observer observer);
	
	/**
	 * 通知观察者
	 */
	void notifyObserver();
	
}
