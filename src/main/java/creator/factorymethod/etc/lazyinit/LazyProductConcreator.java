package creator.factorymethod.etc.lazyinit;

import creator.factorymethod.common.ConcreteProduct;
import creator.factorymethod.common.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟初始化
 *
 * @author wanghaiyong
 */
public class LazyProductConcreator {

    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product = null;

        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("1")) {
                product = new ConcreteProduct();
            } else if (type.equals("2")) {
                product = new ConcreteProduct();
            }
            prMap.put(type, product);
        }

        return product;
    }

}
