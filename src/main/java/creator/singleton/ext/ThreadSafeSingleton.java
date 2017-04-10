package creator.singleton.ext;

/**
 * 线程安全
 * 恶汉式单例
 * @author wanghaiyong
 *
 */
public class ThreadSafeSingleton implements Singleton{
	private static final Singleton singleton = new ThreadSafeSingleton();
	
	/**
	 * 限制产生多个对象
	 */
	private ThreadSafeSingleton(){}
	
	public static Singleton getSingleton(){
		return singleton;
	}
	
	public static void doSomething(){}
}
