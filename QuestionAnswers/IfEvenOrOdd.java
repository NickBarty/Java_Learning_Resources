package QuestionAnswers;

import java.util.Scanner;

public class IfEvenOrOdd {
    public static void main(String[] args) {
//        Assign used variables
        int num;

//        Assign & declare a scanner object
        Scanner userInput = new Scanner(System.in);

//        Assign user input as integer
        System.out.println("Enter number to see if its even or odd: ");
        num = userInput.nextInt();

//        Check if number is even by modulus'ing the input by 2 to check if number is even
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
