package com.calculatorprogram; // using a package

import java.util.Scanner; // importing a scanner 

public class Calculator { // using the public class Calculator

    public static Double calculate(Double variable1, String sign, Double variable2){
        switch (sign){ // using a switch
            case "/": //Case1
            return variable1 / variable2;
            // returning the values after the divison of var1/var2
            case "*": // Case2
            return variable1 * variable2;
            // returning the values after the multiplication of var1*var2
            case "+": // Case 3
                return variable1 + variable2;
                // returning the values after the addition of var1+var2
                // 
            case "-": // Case4 
                return variable1 - variable2;
                // returning the values after the subtraction of var1-var2
            case "%": // Case5
                return  variable1 % variable2;
                // returning the values after the modulus of var1%var2
            default:
                System.out.println("This Is an Invalid Statement");
                break;
        }
        return null; // returning null
    }
    public static void main(String[] args){
        //Declerations
        Double variable1; // using the data type double for Var1
        Double variable2; // using the data type double for Var2
        Double answer; // using the data type double for the answer
        String sign; // using the data type String for sign
        Scanner keyBoard = new Scanner(System.in); 
        // using an scanner to get inputs for the user
        System.out.print("Please Enter an Expression You Want To Calculate Separated By Spaces: ");
        String input = keyBoard.nextLine();
        Scanner sc = new Scanner(input); 
        // using an scanner to get the inputs
        variable1 = sc.nextDouble(); // getting inputs for var1
        sign = sc.next(); // inputs for the sign
        variable2 = sc.nextDouble(); // input for var2
        answer = calculate(variable1, sign, variable2);
        // calculating the answers with the help of the information the user has
        // entered
        if(answer == null){
        	// using an if statement if answer is equal to null then it will 
        	//print an error messsage
            System.out.println("Invalid Expression: Please  Try again.");
            // displaying invalid expression if the user enter the expression
            // which is not right
            System.exit(0);
        }

        System.out.println("The answer to " + variable1 + " " + sign + " " + variable2 + " is: " + answer);
        // printing out the answer by the helps of the operators
        keyBoard.close();
        sc.close();
    }
}