package creator.builder.demo;

import java.util.List;

public class BMWBuilder extends CarBuilder{

	private BMWModel bMWModel = new BMWModel();
	
	@Override
	public void setSequence(List<String> sequence) {
		this.bMWModel.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bMWModel;
	}

}
