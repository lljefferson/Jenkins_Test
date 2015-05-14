package Jenkins_Test;

public class Module_B {

	public Module_B() {
		// TODO Auto-generated constructor stub
	}
	
	public int return_two() {
		
		int result;
		
		Module_A module_A = new Module_A();
		
		result = module_A.return_num() + module_A.return_num();
		
		int yum = 7+3;
		return yum;
		//return result;
	}
}
