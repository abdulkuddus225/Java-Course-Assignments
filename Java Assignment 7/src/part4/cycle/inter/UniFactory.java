package part4.cycle.inter;

public class UniFactory implements CycleFactory{

	public Cycle getCycle() {
		return new Unicycle();
	}
}

