import java.util.Scanner;
		public class RectangleStat {
		        public static void main(String[] args) {
		            Scanner sc = new Scanner(System.in); // using a scanner 
		            double width; // using the data type double for the width
		            double length; // using the data  type double for the length
		            System.out.println("Enter a value for the width of the rectangle: ");
		            System.out.println("Enter a value for the length of the rectangle: ");
                    // Asking the user to input a value for the width of the rectangle
		            // Asking the user to input a value for the length of the rectangle

		            width= sc.nextDouble(); // it scans the lines 
		            length= sc.nextDouble();
		            // applying the formulae for the area  is: Area= Length * width
		            double area = length *width;
		            System.out.println("The Area of the Rectangle is " + area +" sq. units.");
		            double parameter= 2*(width+length);
		            // applying the formulae to calculate the parameter is 2*(width + length)
		            System.out.println("The parameter of the Rectangle is " + parameter +" units");
		            // outputting  the parameter of the rectangle

		
		

	}

}
