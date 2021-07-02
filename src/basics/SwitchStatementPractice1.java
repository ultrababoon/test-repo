package basics;
import java.util.Scanner;

public class SwitchStatementPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of the week");
		String userInput = sc.nextLine();
		
		switch(userInput) {
		case "Monday" : System.out.println("Today is Monday");
		break;
		case "Tuesday" : System.out.println("Today is Tuesday");
		break;
		default : System.out.println("not a valid day of the week");
	}
	}
}
