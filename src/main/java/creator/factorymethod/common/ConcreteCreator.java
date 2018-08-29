package creator.factorymethod.common;

/**
 * 具体工厂
 *
 * @author wanghaiyong
 */
public class ConcreteCreator implements Creator {


    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

}
