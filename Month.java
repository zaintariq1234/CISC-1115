package com.Month;
import java.util.Scanner; // importing a scanner
public class Month { // public class month

    int monthNumber; // using the data type int for the number of month

    Month(){ // using a  constructors
        monthNumber = 1;
    }

    public Month(int monthNumber) {
        while (monthNumber < 1 || monthNumber > 12) { // using a while loop if month number less than 1 0r
            //month number greater than 12 it will throw an exception

            try {
                throw new IllegalArgumentException("error: Month Number is > 12 or < 1. try again.");
                // if the month number is greater than 12 or less than 1 then it will show the output try again
            } catch (Exception e) {
                Scanner sc = new Scanner(System.in); // using a scanner to ask the user to input the values
                System.out.println("Please enter month number again: "); // asking the user for input
                monthNumber = sc.nextInt();
                this.monthNumber = monthNumber;
                sc.close();
            }
        }
        this.monthNumber = monthNumber;
    }

    public int searchArray(String[] array, String Target) // using an array
    {
        Target = Target.toUpperCase();
        for (int index = 0; index < array.length; index++) { // using a for loop

            if (array[index] == Target) // using an if statement
            {
                return index;
            }
        }
        return -1;
    }

    Month(String monthName) {  // writing out all the month names of the 12 months
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        monthName = monthName.toLowerCase();
        while (searchArray(monthList, monthName) == -1) { // using a while loop

            try {
                throw new IllegalArgumentException("Error: Incorrect Month name entered. try again");
                // throwing an illegal ArgumentException when the user inputs an invalid month number
            } catch (Exception e) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter  the name of the month again: ");
                monthName = sc.next();
                sc.close();
            }
        }
    }

    public String getMonthName() {

        String name = "Month Name not found"; // using the data type string
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"}; // list of months
        int num = this.getMonthNumber();
        num = num - 1;
        return monthList[num]; // returning month list
    }

    public void setMonth(int monthNumber) { // using setters

        if (monthNumber > 12 || monthNumber < 1) { // using an if else statement
            // if the  month number is greater than 12 or the month number is less than one

            this.monthNumber = 1;
        } else {    // using an else statement
            this.monthNumber = monthNumber;
        }
    }

    public int getMonthNumber() {

        return monthNumber; // returning the month number
    }

        public String toString(int number) {
            number = number - 1;
            String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};
            String name = monthList[number];
            return name;
    }
}
class MonthDays extends Month
{

    int year; // using the data type int
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // listing out the
    // days in all 12 months

    public int getYear(){
        return year; // returning year
    }

    public MonthDays(int month, int year)
    {
        super(month); // referning to the parent class of the object
        this.year = year;
    }

    public boolean isLeapYear(int year){ // using boolean to check for the leap year
        if(year % 100 == 0) // using an if statement
        {
            if(year % 400 == 0){ // if year modulus 400 equals to zero
                return true; // returns true
            }
        }
        else if(year % 100 != 0 && year % 4 == 0){ // using an if else statement
            // if year modulus 100 is not equal to zero and year modulus 4 is equal to 0
            return true;  // returns true value
        }
        return false; // returns false value
    }

    public int getNumberOfDays(){

        int days; // using the data type int for days
        int monthNum = super.monthNumber - 1;
        String[] monthList = {"January","February","March","April","May","June","July","August",
                "September","October","November","December"}; // using the data type String to list all the
        // twelve month names
        if(isLeapYear(this.year) && monthNum == 1) { // using an if statement
            days = daysInMonth[monthNum];
            days = days +1;
            return days; // returns days
        }
        else {// using an else statement
            days = daysInMonth[monthNum];
            return days;
        }
    }

    protected void display()
    {
        String monthName = getMonthName();
        System.out.println(monthName + " " + this.getYear() + " has " + getNumberOfDays()
                + " days");
    }
}

class yearProgram
{
    public static void main(String[] args){
        //Declaring variables and objects.
        int month; //using the data type int for month and year
        int year;
        Scanner keyboard = new Scanner(System.in); // using a scanner

        System.out.print("Enter a month between  (1-12): ");
        // asking the user to input the number of month between 1 and 12
        month = keyboard.nextInt(); // taking inputs
        System.out.print("Enter a year: "); // printing out Enter a year
        year = keyboard.nextInt(); // taking inputs

        MonthDays obj = new MonthDays(month, year);
        obj.display();
        keyboard.close();
    }
}
