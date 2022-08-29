package pkg9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FooParameterResolver.class)
public class DependencyInjection2 {
	
	
	 

	   

	    @Test
	   
	    @Tag("my-tag")
	   
	    void test1(Calculation c) {
	        assertEquals(8,c.addition(5, 3));
	        
	    }

}
