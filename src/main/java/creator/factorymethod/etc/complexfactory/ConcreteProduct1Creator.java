package creator.factorymethod.etc.complexfactory;

/**
 * 具体工厂
 * 
 * @author wanghaiyong
 *
 */
public class ConcreteProduct1Creator implements Creator {

	public ConcreteProduct1 createProduct() {
		return new ConcreteProduct1();
	}
	
}
