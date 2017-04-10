package creatorpatten.singleton.ext;

/**
 * 线程安全
 * 懒汉式单例
 * @author wanghaiyong
 *
 */
public class ThreadSafeSingleton2 implements Singleton{
	private static Singleton singleton;
	
	/**
	 * 限制产生多个对象
	 */
	private ThreadSafeSingleton2(){}
	
	public static Singleton getSingleton(){
		
		if(singleton == null) {
			synchronized (singleton) {
				if(singleton == null) {
					singleton = new ThreadSafeSingleton2();
				}
			}
		}
		
		return singleton;
	}
	
	public static void doSomething(){}
}
