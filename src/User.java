/*10-17-17
 * Scheduler System
 * User Class Creation
 */

//Imports utility package
import java.util.*;


	//Creates User
public class User {
	
	private int age;
	protected int empId = 00000;
	private String firstName;
	private String lastName;
	private String workTitle;
	
		//Setters to give value to User Variables
		public void setAge () { 
			if(age > 18) {
				this.age = age;
			}
			else {
				System.out.println("Please Enter a Valid Age.");
			}
		}
		
		public void setEmpId () { 
			this.empId = empId;
		}
		
		public void setFname () { 
			this.firstName = firstName;
		}
		
		public void setLname () { 
			this.lastName = lastName;
		}
		
		public void setWorkTitle () { 
			this.workTitle = workTitle;
		}
		
		//Getters
		public int getAge (int age) {
			return age;
		}
		
		public int getEmpId (int empId) {
			return empId;
		}
		
		public String getFirstName (String firstName) {
			return firstName;
		}
		
		public String getLastName (String lastName) {
			return lastName;
		}
		
		public String getWorkTitle () {
			return workTitle;
		}
		
		
		//No Arguments Constructor
		public User () {
			age = 0;
			empId = 00000;
			firstName = "";
			lastName = "";
			workTitle = "";
		}
		
		//All Arguments Constructor
		public User (int age, int empId, String firstName, String lastName, String workTitle) {
			this.age = age;
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.workTitle = workTitle;
		}
		
		public void showUser () {	
			System.out.println("Hello! " + firstName + " " + lastName);
			System.out.println("You're Employee ID is " + empId);
			System.out.println("You are " + age + "years old.");
			System.out.println("You're a(n)" + workTitle + "At Little Caesaer's Arena.");
		}

	
		
		
	
}