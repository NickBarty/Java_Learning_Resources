package QuestionAnswers;

import javax.swing.*;
import java.util.Scanner;

public class MultiplyDecimals {
    public static void main(String[] args) {
//        Assign used variables
        double num;
        double num2;
        double numMultiplyTotal;

//        Assign and declare a scanner object
        Scanner userInput = new Scanner(System.in);

//        Get first decimal from the console
        System.out.println("Enter the first decimal number:");
        num = userInput.nextDouble();

//        Get second decimal from the console
        System.out.println("Enter the second decimal number:");
        num2 = userInput.nextDouble();

//        Multiply two numbers together
        numMultiplyTotal = num * num2;
        JOptionPane.showMessageDialog(null, String.format("%s * %s = %s", num, num2, numMultiplyTotal));
    }
}
