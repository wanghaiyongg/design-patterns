package creator.builder.common;

public class ConcreteProduct extends Builder {

    /**
     * 设置产品零件
     */
    @Override
    public void setPart() {

    }

    /**
     * 组建一个产品
     */
    @Override
    public Product buildProduct() {
        return new Product();
    }


}
