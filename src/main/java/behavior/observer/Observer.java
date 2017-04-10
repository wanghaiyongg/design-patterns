package behavior.observer;

/**
 * 观察者
 * @author wanghaiyong
 *
 */
public interface Observer {

	/**
	 * 观察者收到消息后，即进行update操作，对接收到的信息进行处理
	 */
	void update();
	
}
