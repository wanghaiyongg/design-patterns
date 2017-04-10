package creator.singleton.ext;

/**
 * 线程不安全
 * @author wanghaiyong
 *
 */
public class ThreadNotSafeSingleton implements Singleton{
	private static Singleton singleton;
	
	/**
	 * 限制产生多个对象
	 */
	private ThreadNotSafeSingleton(){}
	
	/**
	 * 并发情况下会产生多个实例
	 * @return
	 */
	public static Singleton getSingleton(){
		if(singleton == null) {
			singleton = new ThreadNotSafeSingleton();
		}
		
		return singleton;
	}
	
	public static void doSomething(){}
}
