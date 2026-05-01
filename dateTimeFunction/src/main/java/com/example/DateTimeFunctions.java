package com.example;

import java.time.*;

public class DateTimeFunctions {

	/*
	 * Update the class and existing methods as necessary to perform the required calculations
	 * and return the expected results.
	 *
	 * - All code should be inside the placeholders provided.
	 * - Do not add code outside of the placeholders.
	 * - Do not change code except as required inside the placeholders.
	 *	    //YOUR CODE STARTS HERE
	 *
	 *		//YOUR CODE ENDS HERE
	 */


	/*
	 * Implement the method so that it returns today's date.
	 */
	public static LocalDate getTodaysDate() {
		//YOUR CODE STARTS HERE
		// LocalDate.now() uses the system's current date and returns it as a LocalDate object.
		return LocalDate.now();
		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x days after
	 * the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		// plusDays(x) creates and returns a new LocalDate that is x days after the input date.
		return date.plusDays(x);
		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x weeks prior to
	 * the input date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		// minusWeeks(x) creates and returns a new LocalDate that is x weeks before the input date.
		return date.minusWeeks(x);
		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the time difference between two input dates
	 * in terms of years, months, and days.
	 * Return the String in the format: "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		//YOUR CODE STARTS HERE
		// Period.between(start, end) calculates the difference in years, months, and days.
		// To keep the result positive, the earlier date as the start and the later date as the end is used.
		LocalDate startDate = date1;
		LocalDate endDate = date2;

		// If date1 is after date2, swaps them so the Period result represents a positive time difference.
		if (date1.isAfter(date2)) {
			startDate = date2;
			endDate = date1;
		}

		// Store the calculated difference between the two dates.
		Period difference = Period.between(startDate, endDate);

		// Builds and returns the String in the exact format required by the assignment.
		return "Year-" + difference.getYears()
				+ ":Months-" + difference.getMonths()
				+ ":Days-" + difference.getDays();
		//YOUR CODE ENDS HERE

	}

	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " +
				"and June 30, 2031 is: " +
				getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
	}
}