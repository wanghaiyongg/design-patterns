package creator.prototype;

/**
 * 原型类
 * @author wanghaiyong
 *
 */
public class PrototypeClass implements Cloneable{

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
