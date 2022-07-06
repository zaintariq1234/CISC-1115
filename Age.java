import java.util.Scanner;
import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;
public class Age {

		public static void main(String args[])   
		{  
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
		// asking the user to input there date of birth in the format YYYY-MM-DD
		Scanner scanner = new Scanner(System.in); //using a scanner
		//reads the date of birth from the user  
		String input = scanner.nextLine();  
		scanner.close();    
		LocalDate dateofbirth = LocalDate.parse(input);  
		//prints the age  
		System.out.println("You are " + calculateAge(dateofbirth)+" years old.");  
		}  
		//the method calculates the age  
		public static int calculateAge(LocalDate dateofbirth)   
		{  
		//creating an instance of the LocalDate class and invoking the now() method      
		//now() method obtains the current date from the system clock in the default time zone      
		LocalDate curDate = LocalDate.now();  
		//it calculates the  time between two dates
		//returns the years
		if ((dateofbirth != null) && (curDate != null)) // using an if else statement
			// if date of birth is not equal to null and current date is not equal to null 
		{  
		return Period.between(dateofbirth, curDate).getYears();  
		//return period
		}  
		else  // else return 0
		{  
		return 0;  
		}  
		}  
		 
		
		
		
		

	}


