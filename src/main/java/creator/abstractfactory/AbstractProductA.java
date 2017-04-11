package creator.abstractfactory;

/**
 * 
 * @author wanghaiyong
 *
 */
public abstract class AbstractProductA {
	
	/**
	 * 每个产品共有的方法
	 */
	public void shareMethod(){}
	
	/**
	 * 抽象方法，具体产品实现
	 */
	public abstract void dosomething();
}
