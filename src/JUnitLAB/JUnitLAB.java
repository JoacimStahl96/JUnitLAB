package JUnitLAB;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame; // assertSame and assertNotSame is used by Assertions import.
import static org.junit.Assert.assertNotSame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JUnitLAB {
	// checks if 9 is larger than 3, if it is, the test will pass
	@Test
	public void testingAssertTrue() {
		assertTrue(9 > 3);
		System.out.println("Is 9 larger than 3? " + "Indeed it is.");
	}

	// checks if 9 is lesser than 3, it will pass since it isn't true
	@Test
	public void testingAssertNotTrue() {
		assertFalse(9 < 3);
		System.out.println("3 isn't larger than 9.");
	}

	// I suppose Disables is used when we want to ignore functioning code
	// This will pass when the disabled condition is removed.
	@Disabled
	@Test
	public void testSomeMore() {
		assertFalse("is it true?", 7 < 3);

	}

	@Test
	public void testCase() {

		String original = "how to do it.";
		String cloneOriginal = original;
		String different = "java";

		// not the same, test will fail
		Assertions.assertSame(cloneOriginal, different);

		// they're the same, test will pass
		Assertions.assertSame(cloneOriginal, original);

		// they're not the same, the test will pass
		Assertions.assertNotSame(different, original);

		// they're the same, test will fail
		Assertions.assertNotSame(cloneOriginal, original);
	}

}
