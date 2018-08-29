package creator.prototype;

/**
 * @author <a href="mailto:wanghy23@asiainfo.com">wanghy23</a>
 */
public class common {
    /**
     * 原型类
     * @author wanghaiyong
     *
     */
    public static class PrototypeClass implements Cloneable{

        @Override
        public PrototypeClass clone(){
            PrototypeClass prototype = null;
            try {
                prototype = (PrototypeClass) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            return prototype;
        }

    }
}
