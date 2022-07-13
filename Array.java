package com.arrays;
import java.time.LocalTime;
import java.util.Random;
public class Array{

public static void main(String[] args){

       int numberOfRows; // using the data type int for the number of Rows
       int numberOfColumns; // using the data type int for the number of Columns

       

       String[] stringArray = {"First", "Second", "Third", "Fourth" ,"Fifth","Sixth", "Seventh","Eighth", "Ninth", "Tenth"};
//using the data type String 
//initializing a string array and also declaring it

       //Declaring the time array
       LocalTime[] timeArray = new LocalTime[3];
       timeArray[0] = LocalTime.now();
       timeArray[1] = LocalTime.of(5,15,30);
       timeArray[2] = LocalTime.of(3,10,35);

       //Initializing the 2d array
       int [][] values = new int[10][20]; // ten rows and twenty columns
       System.out.println("\nPrinting the StringArray: ");
       // printing out the String array
       printElements(stringArray);
       System.out.println("\nPrinting the basicArray function: "); 
       // printing out the basic array function
       basicArray();
       
       System.out.println("Printing the TimeArray: ");
       // printing out the TimeArray
       printElements(timeArray);
       //Gets and prints rows and columns of the 2d array.
       numberOfRows = values.length; // number of rows

       numberOfColumns = values[0].length; // number of columns
       System.out.println("\nTheNumber of rows in the 2d array are " + numberOfRows +
               " and the number of columns are " + numberOfColumns);
       //printing array
       values = initializeArray(values);
       printElements(values);

   }

   public static void basicArray(){ // initializing an array and also declaring a function
    // new method basicArray     
   
       int size = 50; // the number of elements are 50 or size
       int[] nums = new int[size]; // using the data type int
       //initializing an Array
       for(int index = 0; index < size; index++) // using a for loop
       {
           nums[index] = 10;

       }
       for(int counter = 0; counter < size; counter++){ // using a for loop
       

           System.out.println("The value at index " + counter + " is: " + nums[counter]);
// printing the value of the index

       }
   }
   // the Function takes in a string array and prints to screen.
   public static void printElements(String[] array){ // writing a method for printingElements
   
       //declaring  a  string object
       String storedValue;
       for(int index = 0; index < array.length; index++) // using a for loop
       {
           storedValue = array[index];
           System.out.println("\nThe value of the string array at index " + index + " is: " + storedValue);
           // printing the value of the string array
       }
       System.out.println("\n");

   }

   public static void printElements(int[][] array){ // method printElement
       //printing the 2d array.
       for(int row = 0; row < array.length; row++)
       {
           // prints columns
           for(int col = 0; col < array.length; col++)
           {
               System.out.printf("%d ", array[row][col]); // using printf to format the output


           }
           System.out.print("\n");
       }


   }


   public static int[][] initializeArray(int[][] array){ // initalizing an array
       Random rd = new Random();
       for(int row = 0; row < array.length; row++) // using a for loop
       {
           for(int col = 0; col < array.length; col++) // using a for loop
           {
               array[row][col] = rd.nextInt(9) + 1;
           }
       }
       return array;
   }
   // printing  Time object array
   public static void printElements(LocalTime[] array){
       String arrayValue;
       //Printing  the array
       for(int index = 0; index < array.length; index++) // using a for loop
       {
           arrayValue = String.valueOf(array[index]);
           System.out.println("the value of the Time array at index " + index + " is: " + arrayValue);
           // printing out the value of the time array at the index
       }


   }


}


