
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		
		Tax incomeTax = new Tax();

		Employee e = null;
		
		e = new Employee();
		
		incomeTax.calculateTax(e);
		
		e = new Manager();
		
		incomeTax.calculateTax(e);
		
		
		e = new Engineer();
		
		incomeTax.calculateTax(e);
		
		e = new SoftwareEngineer();
		
		incomeTax.calculateTax(e);
		
		
		
	}
}
