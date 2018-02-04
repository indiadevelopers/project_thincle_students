
public class Tax {

	public void calculateTax(Employee employee) {
		
		if(employee instanceof Manager) {
			
			System.out.println("12%");
		} else if(employee instanceof Engineer) {
			
			System.out.println("10%");
		} else if(employee instanceof SoftwareEngineer) {
			
			System.out.println("10.5%");
			
		} else {
			
			System.out.println("0%");
		}
	}
}
