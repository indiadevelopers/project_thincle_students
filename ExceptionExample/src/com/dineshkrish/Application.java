package com.dineshkrish;

public class Application {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setCustId(101);
		c.setCustAge(20);
		c.setCustName("Dinesh");
		
	
		CustomerService service = new CustomerService();
		
		try {
			
			System.out.println("db openned");
			
			service.add(c);
		} catch (CustomerIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(CustomerException e) {
			
			System.out.println(e.getMessage());
		}  catch(Exception e) {
			
		} finally {
			
			System.out.println("db closed");
		}
		
		
	}
}
