package creatorpatten.singleton.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 固定多个实例
 * @author wanghaiyong
 */
public class MultiSingleton implements Singleton{

	private static final int NUM = 3;
	
	private String name;
	
	private static final List<MultiSingleton> singletons = new ArrayList<MultiSingleton>();
	
	private MultiSingleton() {}
	
	private MultiSingleton(String name) {
		this.name = name;
	}
	
	static {
		for(int i =0; i <NUM; i++) {
			singletons.add(new MultiSingleton("MultiSingleton" + i));
		}
	}

	public static MultiSingleton getInstance(){
		return singletons.get(new Random().nextInt(NUM));
	}
	
	public void dosomething(){
		System.out.println(this.name);
	}
}
