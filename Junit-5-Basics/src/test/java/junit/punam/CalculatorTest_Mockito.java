package junit.punam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorTest_Mockito {

	Calculator c = null;
	CalculatorService service = Mockito.mock(CalculatorService.class);

	// @Mock
	// CalculatorService service ;
	// @Rule public MockitoRule rule = MockitoJUnit.rule();

	@BeforeEach
	public void setUp() {
		c = new Calculator(service);
	}

	@Test
	public void addTwoNumberTest() {

		Mockito.when(service.add(2, 3)).thenReturn(5);
		Mockito.when(service.add(-2, -3)).thenReturn(-5);

		assertEquals(5, c.addTwoNumber(2, 3));
		assertEquals(-5, c.addTwoNumber(-2, -3));
		//assertEquals(-10, c.addTwoNumber(-7, 3));  ->will throw error cause we haven't specified mock behavoiur above
		Mockito.verify(service);
	}

}
