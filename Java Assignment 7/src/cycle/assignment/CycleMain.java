package cycle.assignment;

public class CycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle[] cycles = new Cycle[] { new Cycle(), new Unicycle(), new Bicycle(), new Tricycle(), };

		for (Cycle c : cycles) {
			c.cycle();

			// c.balance();

			((Unicycle) c).balance();
			((Bicycle) c).balance();
		}

	}

}
