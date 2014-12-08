package testcase;

import static org.junit.Assert.*;
import impl.PrimeFactor;

import org.junit.Test;

public class TestPrimeFactors {

	@Test
	public void shouldReturnListFactor() {
		int number = 2;
		String expected = "2 ";
		String actual = PrimeFactor.printFactors(number);
		assertEquals(expected, actual);
		number = 4;
		expected = "2 2 ";
		actual = PrimeFactor.printFactors(number);
		assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldReturnExceptionWhenInputNegative() {
		int number = -2;
		PrimeFactor.printFactors(number);
	}

}
