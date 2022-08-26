package pkg2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
class CalculationTest {

	
	@Test
	void test() {
		Calculation obj=new Calculation();
		assertEquals(11, obj.addition(5,6));
	}
	
	@Test 
	void test1() {
		
		
			
		assertThrows(ArithmeticException.class, obj.addition(5,0);});
		
		
	}
	

}
