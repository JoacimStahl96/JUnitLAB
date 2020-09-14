package JUnitLAB;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.EnableJUnit4MigrationSupport;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

// @ExtendWith(IgnoreCondition.class)
@EnableJUnit4MigrationSupport
class TestForTests {
	@Ignore
	@Test
	void testWillBeIgnored() {
		
	}
	@Test
	void testWillBeExectued() {
		
	}

	@Test
	void addition() {
		//fail("Not yet implemented");
		
		System.out.println(" adding test");
		 Calculator calculator = new Calculator();
		 assertEquals(2, calculator.add(1,  1));
	}
	@Test
	void additionButFails() {
		
		System.out.println(" adding failing test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1));
	}
	

}
