package com.program2;
import java.util.Scanner;
		public class Program2{
		        public static void main(String[] args) {
		        	int choice;
		        	double side1,side2;
		        	final double PI= 3.142;
		            Scanner keyBoard = new Scanner(System.in);
		            dispalyMenu();
		            choice=keyBoard.nextInt();
		            switch(choice)
		            
		            
		           
		            
		            case 1: 
		            	System.out.print("Enter the length of the square");
		            side1=keyBoard.nextDouble();
		            displaySquare(side1);
		            break;
		            System.out.print("Please Enter the length of the rectangle:");
		            side1= keyBoard.nextDouble();
		            System.out.print("Please Enter the width of the rectangle:");
		            side2 = keyBoard.nextDouble();
		            displayrectangle(side1 , side2);
		            break;
		            
		            
		            
		            case 3:
		            	System.out.println("Enter the radius of the circle:");
		            side1=keyBoard.nextDouble();
		            dispalyCircle(PI,side1);
		            break;
		            
		            	System.out.println("Errors:please enter a valid choice.\n Terminating Program");
		            	break;
		        
		}
		            	
		        
		            	private static void Dispalyside(double side1, double side2) {
					// TODO Auto-generated method stub
					
				}


						public static void dispalyMenu() {
		            		System.out.print("1.Square\n2.Rectangle\n3.Circle\n");
		            		System.out.print("Choose from the above menu and enter choice:");
		            		
		            		
		            	}
		            	public static void displaySquare(double length)
		            	{
		            		double area= length*length;
		            		double perimeter=4*length;
		            		System.out.println("The area of the square with lenghth "+length+"is"+area+"and the"+
		            		"perimeter is "+perimeter);
		            	}
		            	public static void dispalyRectangle(double length,double width)
		            	{
		            		double area= length*width;
		            		double perimeter=2*(length+width);
		            		System.out.println("The area of rectangle with the length"+length+"and width"+
		            		width+"is" +area+"and the perimeter is "+ perimeter);
		            	}
		            	public static void dispalyCircle(final double PI,double radius) {
		            		double area=PI*(radius*radius);
		            		double circumference= 2*(PI*radius);
		            		System.out.println("The area of the circle with radius"+radius+ " is" +area+
		            				"and the circumference is"+circumference);
		            	}
					
				}
		
		      
		            
		            
		            
		            
		            
		            
		            


