package creator.builder.demo;


public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("宝马跑起来");
	}

	@Override
	protected void stop() {
		System.out.println("宝马停下来");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马喇叭响");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马引擎响");
	}

}
