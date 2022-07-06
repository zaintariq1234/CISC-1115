import java.io.File;
    	 import java.io.PrintStream;
    	 import java.util.Scanner;


    	 public class Program1 {
    	    public static void main(String[] args) throws Exception
    	    {
    	        int input; // data type for the input is int


    	       
    	        Scanner scanner = new Scanner(new File("readFile.txt"));
    	        // using a scanner to readFile
    	        PrintStream ps = new PrintStream("printFile.txt");


    	        while(scanner.hasNext()) //using a while loop
    	        {
    	            
    	            input = scanner.nextInt();
    	            displaySumOfSquares(input, ps); // displaying the sumofSquares
    	            input = scanner.nextInt();
    	            displayFactorial(input, ps);
    	            input = scanner.nextInt();
    	            fibonacciSequence(input, ps); // displaying the fibonacciSequence
    	        }
    	        scanner.close();
    	        ps.close();
    	    }
public static void displaySumOfSquares(int num, PrintStream ps)
    	    {
    	        int sum = 0;
    	        for (int x = 1; x <= num; x++) // using a for loop
    	        {
    	            sum += (x * x);// using a compound addition assigement operator
    	        }
    	        System.out.println("The sum of squares for "+ num + " is: " + sum);
    	        //outputing the sum of the squares
    	        ps.println("The sum of squares for "+ num + " is: " + sum);
    	        // printing a string and then termianting the line
    	    }
    	    
    	    public static void displayFactorial(int num, PrintStream PS) {
    	        int answer = 1;
    	        for (int x = 1; x <= num; x++) {
    	        	// using a for loop
    	            answer = answer * x;
    	        }
    	        System.out.println("The factorial of " + num + " is: " + answer);
    	        //outputing the factroial
    	        PS.println("The factorial of " + num + " is: " + answer);
    	        //displaying the answer
    	    }


    	   
    	    public static void fibonacciSequence(int inputNum, PrintStream ps)
    	    // displaying the fibonacci Sequence
    	    {
    	       
    	        int num1 = 0, num2 = 1, counter, sum;
    	        System.out.print("\nThe fibonacci sequence for" + inputNum + " is: " + num1 + " " + num2);
    	        // displaying the answer of the fibonacci sequence of the numbers the user inputed
    	        ps.print("\nThe fibonacci sequence for " + inputNum + " is: "+ num1 + " " + num2);
    	        for(counter = 2; counter < inputNum; counter++)
    	        	// using a for loop
    	        {
    	            
    	            sum = num2 + num1;
    	            // swapping number to check the next number that is in line
    	            System.out.print( " " + sum);
    	            ps.print( " " + sum);
    	            num1 = num2;
    	            num2 = sum;
    	        }
    	    }
    	 



	}


