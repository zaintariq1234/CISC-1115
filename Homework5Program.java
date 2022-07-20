package com.Homework5Program;
		import java.io.File;
		import java.io.PrintStream; // importing PrintStream
		import java.util.Scanner; // importing a scanner

		public class Homework5Program{
		   public static void main(String[] args) throws Exception{
		   
		       int distance; // using the data type integer
		       int time; // using the data type integer for time
		       int speed; // using the data type integer for the distance
		       String line, vehicleName; // using the data type String for the vehicle name
		       Scanner scanner = new Scanner(new File("ReadFile.txt.")); // using a scanner"
		       PrintStream ps = new PrintStream("OutFile.txt");
		       line = scanner.nextLine();
		       scanner.useDelimiter(",|\\n");
		       while(scanner.hasNext()){ // using a while loop
		           vehicleName = scanner.next();
		           time = Integer.parseInt(scanner.next().trim());
		           speed = Integer.parseInt(scanner.next());// reading input data for time
		           if(speed < 0 || time < 1){ // using a if loop
		           
		               System.out.println("\nError: Invalid Input. Make sure the  speed > 0 and time >=1.");
		               break;
		           }
		           saveAsFile(ps,speed,time,vehicleName); // saving it as a file
		           printReport(speed, time, vehicleName); // printing the report
		           distance = calculatingDistance(speed, time); // calculating distance
		       }
		       scanner.close();
		       ps.close();
		   }
		   public static int calculatingDistance(int speed, int time)// taking the values of speed and time
		   {
		       return speed * time; // returning the distance by multiplying speed * time
		   }
		   public static void printReport( int time,int speed, String vehicleName)
		   //printing out the report of the current vehicle which includes speed,time and name
		   {
		       int distance = speed;
		       System.out.println("\nReport for vehicle: " + vehicleName);
		       // printing the report of the vehicle Name
		       System.out.println("\tHour\t\tDistance Traveled\n--------------------");
		       // printing the total distance traveled

		       for(int count = 1; count <= time; count++) // using a for loop
		       {
		           System.out.println("\t" + count + "\t\t" + distance);
		           distance = distance + speed;
		       }
		   }

		  public static void saveAsFile(PrintStream ps, int time,int speed, String vehicleName){
		  // writing the report to an output file
		       int distance = speed;
		       ps.println("\nReport for vehicle: " + vehicleName);
		       ps.println("\tHour\t\tDistance Traveled\n--------------------");

		       for(int count = 1; count <= time; count++)// using a for loop
		       {
		           ps.println("\t" + count + "\t\t" + distance);
		           distance = distance + speed;
		       }
		   }
		}

		   

