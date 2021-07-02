/**
 * 
 */
package Assignments;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Arun, Student DataBase
 *
 */
public class assignment2T {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stud1 = new Student("Roger", "000111222");
		Student stud2 = new Student("Mark", "000111333");
//		Student stud3 = new Student("Tim", "000111444");
	}

}


class Student {
	
	private String SSN;
	private String emailID;
	private static int ID = 100;
	private String name;
	private static String phone;
	private static String city;
	private static String state;
	private static double balance = 1001;
	
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		System.out.println("New Account register: " + name);
		ID++;
		setID();
		getEmail();
		enroll();
		pay(600);
		checkBalance();
		setPhone("7703778773");
		setCity("Kennesaw");
		setState("GA");
		System.out.println(name.toString());
;		
	}
	
	private void setID() {
		int max = 9000;
		int min = 1000;
		Random ran = new Random();
		int random = ran.nextInt(8000) + 1001;
		System.out.println("Account ID: " + random + SSN.substring(5, 9) + "\nYour email is: " + getEmail());
		}
	private String getEmail() {
		return name.toLowerCase() + "@gmail.com";
		
	}
	public void enroll() {
		System.out.println("Enrollment status: Is enrolled for this term.");
	}
	
	public void pay(int payment) {
		System.out.println("Payment of: " + payment);
		balance = payment + balance;
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
 	}
	

	public String toString() {

		return "Name: " + name + "\nstudent ID: " + ID + "\nemail: " + getEmail() + "\nphone: " + phone + "\ncity: " + city + ", " + state + "\nYour balance is: R" + balance;

		}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void showCourses() {
		System.out.println("Courses: ");
	}
	
}
	
 
