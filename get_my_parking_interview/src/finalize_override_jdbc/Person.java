package finalize_override_jdbc;

import java.time.LocalDate;

public class Person {
	
	private final String firstName;
    private final String lastName;
    private final LocalDate dob;

	public Person(String firstName, String lastName, LocalDate dob) {
		
		 this.firstName = firstName;
         this.lastName = lastName;
         this.dob = dob;
	
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getDob() {
		return dob;
	}


}
