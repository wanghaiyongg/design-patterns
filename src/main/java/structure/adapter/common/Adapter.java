package structure.adapter.common;

/**
 * @author <a href="mailto:wanghy23@asiainfo.com">wanghy23</a>
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter method!");
        adaptee.adapteeMethod();
    }


}
