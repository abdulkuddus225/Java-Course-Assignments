package part4.cycle.inter;

public class MainClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cycle rideUniCycle = new UniFactory().getCycle();
		rideUniCycle.ride();
		
		Cycle rideBiCycle = new BiFactory().getCycle();
		rideBiCycle.ride();
		
		Cycle rideTriCycle = new TriFactory().getCycle();
		rideTriCycle.ride();
		
	}

	

	

}
