package rodent.behaviours;

public class RodentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rod = { new AlaskaMarmot(), new HouseMouse(), };

		for (Rodent i : rod) {
			i.name();
			i.type();
			i.teeth();
		}
	}

}
