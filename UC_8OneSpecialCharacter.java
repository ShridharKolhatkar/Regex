package rgex.com;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class uc_8OneSpecialCharacter {
	/*
	 * @purpose:In registration system check password is valid or invalid
	 * @return: No return value
	 */
	public static void checkValidpassword(String password) 
	 {	
			boolean ispassword;
			String passwordRegex = "^[A-Z]{1}[a-z]{2,}@[0-9]{2,}$";
			Pattern pattern = Pattern.compile(passwordRegex);
			
			if (password == null) 
			{
				ispassword = false;
			}
			
			Matcher matcher = pattern.matcher(password);
			ispassword = matcher.matches();
			
           if (ispassword)
	        	System.out.println(password + " password id is vaild");
			else
				System.out.println(password + " password id is not vaild");
	  }
		  public static void main(String[] args) 
		  {
			  
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the password:");
			String password= sc.nextLine();
			 checkValidpassword(password);
		  }
		  
}
	




