package kycForm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KycForm {

	private String signup_date;
	private String current_date;

	public KycForm(String regDate, String currDate) {
		this.signup_date = regDate;
		this.current_date = currDate;
	}

	public void getRange() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate registrationDate = LocalDate.parse(signup_date, formatter);
		LocalDate currentDate = LocalDate.parse(current_date, formatter);
		LocalDate anniversary = registrationDate.plusYears(currentDate.getYear() - registrationDate.getYear());

		if (registrationDate.isAfter(currentDate)) {
			System.out.println("No Range");
		} else {
			LocalDate rangeFrom = null;
			LocalDate rangeto = null;

			if (anniversary.isAfter(currentDate)) {
				rangeFrom = anniversary.minusDays(30);
				rangeto = currentDate;
				System.out.println(rangeFrom.format(formatter).toString() + " " + rangeto.format(formatter).toString());
			}

			else if (anniversary.isBefore(currentDate) || anniversary.isEqual(currentDate)) {

				rangeFrom = anniversary.plusDays(30);
				rangeto = anniversary.minusDays(30);
				System.out.println(rangeFrom.format(formatter).toString() + " " + rangeto.format(formatter).toString());
			}

			else {
				System.out.println("No Range");
			}
		}

	}

}
