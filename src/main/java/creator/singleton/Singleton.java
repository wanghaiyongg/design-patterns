package creator.singleton;

public class Singleton {

	private static final Singleton singleton = new Singleton();
	
	private Singleton(){}
	
	public static final Singleton getInstance(){
		return singleton;
	}
	
	public void dosomething(){
		
	}
}
