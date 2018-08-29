package creator.factorymethod.common;

/**
 * @author <a href="mailto:wanghy23@asiainfo.com">wanghy23</a>
 */
public class Test {

    public static void main(String[] args) {
        Creator concreteCreator = new ConcreteCreator();
        Product concreteProduct = concreteCreator.factoryMethod();
        concreteProduct.doWork();
    }

}
