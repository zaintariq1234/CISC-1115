package com.wordcounter; // using a package word counter
import java.io.File;
import java.util.Scanner; // importing a scanner

public class wordCounter {  // the public class is word counter
    public static int calculateWordCount(Scanner inputFile){
        int wordCount = 0; // using the data type int for the word count 
        
       // and starting from 0
        String word;   // using the data type String for the words
        while(inputFile.hasNextLine()) // using a while statement
        {
            word = inputFile.nextLine(); 
            String[] storeWord = word.trim().split("\\A+"); 
            // starting the word count from A
            wordCount += storeWord.length; // checking the length of the words 
            // that are stored in the file

        }
        inputFile.close();
        return wordCount;  // returning word count
    }

    public static void main(String[] args) throws Exception
    {
        Scanner inputFile = new Scanner(new File("readFile.txt")); // using a scanner to read the data
        // in the text file
        int wordCount = calculateWordCount(inputFile); // calculating the word count on the base of the data
        // in the text file
        System.out.println("The Total  Word Count For The  File is: " + wordCount);
        // displaying the total word count from the given text file

    }
}
