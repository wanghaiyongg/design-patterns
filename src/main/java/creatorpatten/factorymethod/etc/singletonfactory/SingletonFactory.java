package creatorpatten.factorymethod.etc.singletonfactory;

import java.lang.reflect.Constructor;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SingletonFactory {

	private static Singleton singleton;
	
	static {
		try {
			Class cl = Class.forName(Singleton.class.getName());
			Constructor co = cl.getDeclaredConstructor();
			co.setAccessible(true);
			singleton = (Singleton) co.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
}
