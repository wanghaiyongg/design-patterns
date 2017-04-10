package creatorpatten.factorymethod.etc;

import java.util.HashMap;
import java.util.Map;

import creatorpatten.factorymethod.Product;
import creatorpatten.factorymethod.etc.complexfactory.ConcreteProduct1;
import creatorpatten.factorymethod.etc.complexfactory.ConcreteProduct2;

/**
 * 延迟初始化
 * 
 * @author wanghaiyong
 *
 */
public class LazyProductConcreator {
	
	private static final Map<String,Product> prMap = new HashMap<String, Product>();
	
	public static synchronized Product createProduct(String type){
		Product product = null;
		
		if(prMap.containsKey(type)) {
			product = prMap.get(type);
		} else {
			if(type.equals(ConcreteProduct1.class.getSimpleName())) {
				product = new ConcreteProduct1();
			} else if(type.equals(ConcreteProduct2.class.getSimpleName())) {
				product = new ConcreteProduct2();
			}
			prMap.put(type, product);
		}
		
		return product;
	}
	
}
