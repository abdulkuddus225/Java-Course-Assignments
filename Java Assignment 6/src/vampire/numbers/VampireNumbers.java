package vampire.numbers;

import java.util.Arrays;

public class VampireNumbers {

	private int number;
	private int digitCount = 0;
	private int second_factor;
	private int factor;
	private int v = 0;

	public VampireNumbers(int number) {
		this.number = number;
	}

	public boolean vampireNumbers() {

		for (int i = number; i > 0; i = i / 10) {
			digitCount++;
		}

		if (digitCount % 2 != 0) {
			return false;

		}
		if (digitCount == 2) {
			return false;
		}

		int start_factor_range = (int) Math.pow(10, (digitCount / 2) - 1);
		int end_factor_range = (int) Math.pow(10, digitCount / 2);
		for (int i = start_factor_range; i < end_factor_range; i++) {
			if (number % i == 0) {
				second_factor = number / i;

				if (!(second_factor >= Math.pow(10, digitCount / 2 - 1)
						&& second_factor < Math.pow(10, digitCount / 2)))
					continue;

				factor = i * (int) Math.pow(10, digitCount / 2) + second_factor;
				if (i % 10 == 0 && second_factor % 10 == 0)
					break;
				else {
					String s1 = String.valueOf(factor);
					char[] c1 = s1.toCharArray();
					String s2 = String.valueOf(number);
					char[] c2 = s2.toCharArray();
					Arrays.sort(c1);
					Arrays.sort(c2);
					if (Arrays.equals(c1, c2)) {
						v++;
					}

				}
			}

		}
		if (v > 0)
			return true;

		return false;

	}
}
