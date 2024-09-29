package com.calculator.kata;

public class StringCalculator {

	private static final String EMPTY_STRING = "";

	public static String calculateSum(String input) {
		
		if(input.equals(EMPTY_STRING)) {
			return "0";
		}
		
		String[] numbers = input.split(",");
		
		int sum = 0;
		for(String numberString: numbers) {
			sum = sum + Integer.valueOf(numberString);
		}
		return String.valueOf(sum);
	}

}
