package part4.cycle.inter;

public class BiFactory implements CycleFactory{

	public Cycle getCycle() {
		return new Bicycle();
	}
}
