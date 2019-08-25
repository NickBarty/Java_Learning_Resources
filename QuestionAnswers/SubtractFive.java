package QuestionAnswers;

import javax.swing.*;

public class SubtractFive {
    public static void main(String[] args) {
//        Assign used variables
        int num;
        String stringNum;

//        Assign stringNum to value from input dialogue
        stringNum = JOptionPane.showInputDialog(null, "Number to subtract 5 from");

//        Convert input to integer
        num = Integer.parseInt(stringNum);

//        Subtract 5 from input
        num -= 5;

//        Print value to message dialogue
        JOptionPane.showMessageDialog(null, num);
    }
}
