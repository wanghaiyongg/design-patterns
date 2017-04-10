package creatorpatten.factorymethod;

/**
 * 抽象工厂
 * @author wanghaiyong
 *
 */
public abstract class Creator {

	/**
	 * 创建一个产品对象
	 * @param 输入参数通常为String,Enum,Class等，
	 * @return
	 */
	public abstract Product createProduct(Class<? extends Product> c);

}
