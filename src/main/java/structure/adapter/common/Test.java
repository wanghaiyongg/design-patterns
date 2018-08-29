package structure.adapter.common;

/**
 * @author <a href="mailto:wanghy23@asiainfo.com">wanghy23</a>
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }

}
