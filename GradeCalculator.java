import java.util.Scanner;
	public class GradeCalculator {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in); // using a scanner
	        System.out.println("Enter the Codelab score:"); // asking the user to input there
	        //codelab score 
	        double codelab= sc.nextDouble(); // scans the next input as a double
	        System.out.println("Enter the Homework score.");
	        // asking the user to input there homework score
	        double homework= sc.nextDouble();
	        System.out.println("Enter the Midterm 1 score.");
	        //asking the user to input there midterm1 score
	        double midterm1 = sc.nextDouble();
	        System.out.println("Enter the Midterm 2 score.");
	        // asking the user to input there midterm2 score
	        double midterm2 = sc.nextDouble();
	        System.out.println("Enter the Final Exam  score.");
	        // asking the user to input there Final Exam score
	        
	        double finalexam = sc.nextDouble();
	        double totalScore = codelab + homework+ midterm1+ midterm2+ finalexam;
	        // adding up all the scores that were entered by the users.
	        System.out.println("The total score is " + totalScore);
	        // displaying the total score
	        }

}
