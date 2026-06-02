// importing necessary modules
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* Customized error is thrown when the password is not valid (not matched with the criterias) */
class weakPasswordException extends Exception {
	public weakPasswordException(String msg) {
		super(msg);
	}
}

/* Class for validating the password is shown using REGEX for checking criterias, error is thrown when the criterias doesnot match */
class PassWordValidator {
	static void validate(String in) throws weakPasswordException {
		if(!in.matches(".*[A-Z].*")) {
			throw new weakPasswordException("Password must contain an UpperCase Letter");
		}
		if(!in.matches(".*\\d.*")) {
			throw new weakPasswordException("Password must have a digit");
		}
		if(!in.matches(".*[@#$%&!].*")) {
			throw new weakPasswordException("Password must have a special Character");
		}
		if(in.length()<8) {
			throw new weakPasswordException("Password must have atleast 8 Characters");
		}
	}
}

/* A menu driven program is given to the user, user can check the password as many times needed */
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		while(true) {
			System.out.println("MENU\n1.Check Password  2.EXIT");
			int choice= s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Check to see if your password is valid or not \nMin 8 chars\nAt least 1 uppercase\nAt least 1 digit\nAt least 1 special char");
				String in= s.nextLine();
				try {
					PassWordValidator.validate(in);
					System.out.println("Valid Password");
				} catch(weakPasswordException e) {
					System.out.println(e);
				}
				break;
			case 2:
			    System.out.println("Thank You...Visit Again.");
				return;
				
			default:
                System.out.println("Invalid Choice");
			}
			
		}s.close();
	}
}
