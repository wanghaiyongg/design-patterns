package creator.builder.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

	private List<String> sequence = new ArrayList<>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	final public void run() {
		for (String actionName : sequence) {
			switch (actionName) {
			case "start":
				start();
				break;
			case "stop":
				start();
				break;
			case "alarm":
				alarm();
				break;
			case "engineBoom":
				engineBoom();
				break;
			default:
				throw new RuntimeException();
			}
		}
	}
	
	final public void setSequence(List<String> sequence){
		this.sequence = sequence;
	}
}
