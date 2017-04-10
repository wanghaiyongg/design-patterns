package structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝对象
 * 组合树枝节点和叶子节点形成一个树形结构
 * 
 * 
 * @author wanghaiyong
 *
 */
public class Composite extends Compoment{
	
	//构件容器
	private List<Compoment> compositeList = new ArrayList<Compoment>();
	
	//添加叶子构件或树枝构建
	public void add(Compoment compoment){
		compositeList.add(compoment);
	}
	
	//删除叶子构件或树枝构建
	public void remove(Compoment compoment){
		compositeList.remove(compoment);
	}
	
	//获取分支下的所有叶子构件和树枝构件
	public List<Compoment> getChildren() {
		return this.compositeList;
	}
}
