package part4.cycle.inter;

public class TriFactory implements CycleFactory{

	public Cycle getCycle() {
		return new Tricycle();
	}
}
