import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class weakPasswordException extends Exception{
    public weakPasswordException(String msg){
        super(msg);
    }
}

class PassportValidator{
    static void validate(String in) throws weakPasswordException{
        if(in.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[#@$%&]).{8,}$")){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
            throw new weakPasswordException("Password is not suffienciently strong.");
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    System.out.println("Check to see if your password is valid or not \nmin 8 chars\nat least 1 uppercase\nat least 1 digit\nat least 1 special char");
		String in= s.nextLine();
		try{
		PassportValidator.validate(in);
		}catch(weakPasswordException e){
		    System.out.println(e);
		}
		s.close();
	}
}
