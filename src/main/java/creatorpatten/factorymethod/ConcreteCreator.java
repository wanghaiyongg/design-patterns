package creatorpatten.factorymethod;

/**
 * 具体工厂
 * 
 * @author wanghaiyong
 *
 */
public class ConcreteCreator extends Creator {


	@Override
	public Product createProduct(Class<? extends Product> c) {
		Product pr = null;
		try {
			pr = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pr;
	}

}
