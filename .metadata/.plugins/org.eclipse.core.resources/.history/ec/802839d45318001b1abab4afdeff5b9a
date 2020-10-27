package junit.punam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("When testing SumOddRange Class Methods")
class SumOddRangeTest {
	
	SumOddRange obj ;
	
	@BeforeEach
	void createInstance() {
		
		obj = new SumOddRange();
		
	}

	@Test
	@DisplayName("When Testing for Even Numbers")
	void testEvens() {
		assertFalse(SumOddRange.isOdd(2), "2 is not odd");
		assertEquals(false,SumOddRange.isOdd(16), "16 is not odd");
	}
	
	@Test
	@DisplayName("When Testing for Odd Numbers")
	void testOdds() {
		
		assertTrue(SumOddRange.isOdd(3), "3 is odd");
		assertEquals(true, SumOddRange.isOdd(5),"5 is odd");
	}
	
	@Test
	@DisplayName("When Testing for Zero Number")
	void testZero() {
		assertFalse(SumOddRange.isOdd(0),"0 is Even");
	}
	
	@Test
	@DisplayName("When Testing a Negative Even Numbers")
	void testNegativeEvens() {
		assertFalse(SumOddRange.isOdd(-4), "-4 is not odd");
	}
	
	@Test
	@DisplayName("When Testing a Negative Odd Numbers")
	void testNegativeOdds() {
		assertTrue(SumOddRange.isOdd(-7), "-7 is odd");
	}
	
	@Test
	@DisplayName("When Testing sumOdd Method")
	void testSumOdd() {
		assertAll(
					() -> assertEquals(21, obj.sumOdd(5, 10)),
					() -> assertEquals(9, obj.sumOdd(1, 5)),
					() -> assertEquals(-1, obj.sumOdd(10, 5)),
					() -> assertEquals(-1, obj.sumOdd(-5, -10)),
					() -> assertEquals(-1, obj.sumOdd(-15, -10)),
					() -> assertEquals(-1, obj.sumOdd(-15, 10)),
					() -> assertEquals(-1, obj.sumOdd(15, -10)),
					() -> assertEquals(-1, obj.sumOdd(0, 10)),
					() -> assertEquals(-1, obj.sumOdd(10, 0)),
					() -> assertEquals(-1, obj.sumOdd(0, 0))
				 );
	}

}
