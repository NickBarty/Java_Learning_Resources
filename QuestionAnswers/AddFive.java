package QuestionAnswers;

import java.util.Scanner;

class AddFive {

    public static void main(String[] args) {
//        Assign used variables
        int num;
        String stringNum;

//        Assign & declare a scanner object
        Scanner userInput = new Scanner(System.in);

//        Assign user input as string
        System.out.println("Enter number to add 5 to: ");
        stringNum = userInput.next();

//        Convert input to an integer
        num = Integer.parseInt(stringNum);

//        Add 5 to the input
        num += 5;

//        Print the new value to console
        System.out.println(num);
    }
}
