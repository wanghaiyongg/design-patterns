package creator.factorymethod.etc.simplefactory;

import creator.factorymethod.common.ConcreteProduct;
import creator.factorymethod.common.Product;

/**
 * 静态工厂
 * 简单工厂模式
 *
 * @author wanghaiyong
 */
public class SimpleFactory {

    public static Product createProduct() {
        return new ConcreteProduct();
    }

}
