package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import test.IBSNChecker;

class ISBNTest {
	IBSNChecker isbn;
	
	@Before
	public void testISBN () {
		isbn = new IBSNChecker();
	}
	
	@Test
	public void validISBN() {
		assertTrue(IBSNChecker.checker("3-598-21508-8"));
	}

	
}
