import java.util.Scanner; // importing a scanner
public class CircleStat { // using a public class 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // using a scanner 
	System.out.println (" Enter a value for radius when the radius is: ");
	// asking the user to input a value for the radius
	double radius= sc.nextDouble(); // using double because the value can be in a decimal form
	// the formuale used to calculate the area of the circle is Area= PI*radius*radius
	double circumference = Math.PI * 2* radius;
	// applying the formulae of the circumference 
	System.out.print ("The circumference  is : " + circumference);
	// displaying  the circumference of the circle 
	
	double area = Math.PI * (radius * radius); // using the data type double for the area
	System.out.print(" and the area is:" + area); // printing out the area of the circle
	
	}

}
