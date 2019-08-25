package QuestionAnswers;

import java.util.Scanner;

public class PrintDigitFromString {
    public static void main(String[] args) {
//        Assign used variables
        String userString;

//        Assign & declare a scanner object
        Scanner userInput = new Scanner(System.in);

//        Assign user input as sting
        System.out.println("Enter number in string form to see the digit form: ");
        userString = userInput.next();

//        Check if input matches any of the cases and print accordingly
        switch (userString.toLowerCase()) {
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

}
