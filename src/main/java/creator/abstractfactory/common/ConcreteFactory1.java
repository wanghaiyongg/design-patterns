package creator.abstractfactory.common;

/**
 * @author <a href="mailto:wanghy23@asiainfo.com">wanghy23</a>
 */
public class ConcreteFactory1 implements AbstractFactory {


    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
