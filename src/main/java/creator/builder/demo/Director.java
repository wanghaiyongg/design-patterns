package creator.builder.demo;

import java.util.ArrayList;
import java.util.List;

public class Director {
	
	private List<String> sequence = new ArrayList<>();
	
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	private BMWBuilder bMWBuilder = new BMWBuilder();
	
	public BenzModel getABenzModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("end");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	public BenzModel getBBenzModel(){
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("end");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	public BMWModel getCBMWModel(){
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("end");
		this.bMWBuilder.setSequence(sequence);
		return (BMWModel) this.bMWBuilder.getCarModel();
	}
	
	public BMWModel getDBMWModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.bMWBuilder.setSequence(sequence);
		return (BMWModel) this.bMWBuilder.getCarModel();
	}
}
