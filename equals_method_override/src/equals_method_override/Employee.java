/*So, how do we check for equality of values inside the objects?
We can achieve this task by overriding the equals() method of Object class. 
We can override the equals() method in our class to check whether two objects have the same data or not.
https://javagoal.com/equals-and-hashcode-in-java/
*/

package equals_method_override;
	
	public class Employee 
	{
	  int empId;
	  String name;
	  
	  public static void main(String[] args) 
	  {
	    Employee emp1 = new Employee();
	    emp1.name = "Ravi";
	    emp1.empId = 1;
	    
	    Employee emp2 = new Employee();
	    emp2.name = "Ram";
	    emp2.empId = 2;
	    
	    System.out.println("Is both employee have same id:");
	    System.out.println(emp1.equals(emp2));
	    
	    Employee emp3 = new Employee();
	    emp3.name = "Ram";
	    emp3.empId = 2;
	    
	    System.out.println(emp2.equals(emp3));
	    
	  }
	  
	  @Override
	  public boolean equals(Object obj)
	  {
	   //return ((Employee)obj).empId == this.empId;  
		  
		 if (((Employee)obj).empId == this.empId) 
			  
		return true;
			 
		 else 
				  
		return false;
	    }
	}

