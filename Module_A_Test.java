package Jenkins_Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Module_A_Test {

	@Test
	public void test() {
		
		Module_A module_a = new Module_A();
		
		assertEquals("This should return 3", 3, module_a.return_num());
		//ah just a test
		
	}
	
	@Test
	public void test2(){
		Module_A module_a = new Module_A();
		
		assertEquals("This should return 4", 4, module_a.return_num() + 1);
	}
}
