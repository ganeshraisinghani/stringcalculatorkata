package com.calculator.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorTddApplicationTests {

	@Test
	public void emptyStringShouldReturnZero() {
		
		assertThat(StringCalculator.calculateSum("")).isEqualTo("0");
	}
	
	
	@Test
	public void singleNumberShouldReturnItselfAsNumber() {
		
		assertThat(StringCalculator.calculateSum("5")).isEqualTo("5");
	}
	
	
	@Test
	public void sumOfNumbersSeparatedByCommaShouldBeReturned() {
		
		assertThat(StringCalculator.calculateSum("1,2,3")).isEqualTo("6");
	}
}
