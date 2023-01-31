
package org.emp;

public class Employee {

	private void empId() {
		System.out.println("Employee Id : EM1840251");

	}
	private void empName() {
		System.out.println("Employee Name : Raja");

	}
	private void empDob() {
		System.out.println("Employee DOB : 1.2.1985");

	}
	private void empPhone() {
		System.out.println("Employee Ph no. 7010485328");

	}
	private void empEmail() {
		System.out.println("Employee mail-id :employee@company.com");
	}
	private void empAddress() {
		System.out.println("Employee Address : Thoraipakkam,Chennai ");
		
	}
	public static void main(String[] args) {
		Employee e = new Employee ();
		
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
	
	
	
	
	
	
	
}
