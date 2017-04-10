package creatorpatten.factorymethod.etc.complexfactory;

/**
 * 具体工厂
 * 
 * @author wanghaiyong
 *
 */
public class ConcreteProduct2Creator implements Creator {

	public ConcreteProduct2 createProduct() {
		return new ConcreteProduct2();
	}
	
}
