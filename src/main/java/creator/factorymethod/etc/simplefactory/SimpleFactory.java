package creator.factorymethod.etc.simplefactory;

import creator.factorymethod.Product;

/**
 * 静态工厂
 * 简单工厂模式
 * @author wanghaiyong
 *
 */
public class SimpleFactory {

	public static Product createProduct(Class<? extends Product> c) {
		Product pr = null;

		try {
			pr = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pr;
	}
	
}
