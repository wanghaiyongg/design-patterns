package creator.builder;

public class Director {
	private Builder builder = new ConcreteProduct();
	
	/**
	 * 构建不同的产品
	 * @return
	 */
	public Product getAProduct(){
		//设置不同的零件产生不同的产品
		builder.setPart();
		return builder.buildProduct();
	}
	
}
