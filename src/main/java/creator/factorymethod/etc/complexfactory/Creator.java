package creator.factorymethod.etc.complexfactory;

import creator.factorymethod.Product;

/**
 * 产品类型较多情况下，每种产品对于一个工厂实例
 * @author wanghaiyong
 *
 */
public interface Creator {
	
	Product createProduct();
}
