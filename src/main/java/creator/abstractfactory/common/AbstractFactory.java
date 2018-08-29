package creator.abstractfactory.common;

/**
 * 创建抽象产品对象的操作接口
 *
 * @author wanghaiyong
 */
public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
