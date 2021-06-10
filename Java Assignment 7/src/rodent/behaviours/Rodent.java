package rodent.behaviours;

public abstract class Rodent {

	public abstract void name();

	public abstract void type();

	public void teeth() {
		System.out.println("All rodents possess constantly growing rootless incisors that have a hard enamel"
				+ " layer on the front of each tooth and softer dentine behind");
	}

}
	