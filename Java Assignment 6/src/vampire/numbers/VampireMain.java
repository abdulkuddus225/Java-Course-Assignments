package vampire.numbers;

public class VampireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		System.out.println("First 100 Vapire Numbers are........");
		for (int i = 10; i < 1599990; i++) {
			if (count == 100) {
				break;
			}
			VampireNumbers v = new VampireNumbers(i);
			if (v.vampireNumbers()) {
				count++;
				System.out.println(i);
			}
		}
	}

}
