import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
class AllConceptExamples {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    ACCESS LEVEL SPECIFIER EXAMPLES:

    //    "Public" level code is accessible by anything
    public int publicInt;

    //  "Protected" level code is accessible in the same package and subclasses
    protected int protectedInt;

    //    "PackagePrivate" level code is the default, and is only accessible to classes within the same package
    int packagePrivateInt;

    //    "Private" level code is accessible only in the declared class
    private int privateInt;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
//      - All of these are method calls to the respective example:
//      - Un-comment them (CTRL+/) to have them run
//      - NOT ALL OF THEM RUN! IT'S PRIMARILY TO LOOK AT!! (Ones that have 'System.out.println' can run and produce output!)
//      - CTRL + Click a method call to go to the method
//        PLEASE NOTE: All methods are static as they are referenced from the main, and as such are being referenced from a static context, and as such need to be static themselves

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        PRIMITIVE EXAMPLES
//        primitiveTypeExamples();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        COMMONLY USED CLASSES
//        commonlyUsedClasses();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nOPERATOR EXAMPLES:");
//        operatorExamples();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nCONTINUOUS PRINT TO CONSOLE ON SINGLE LINE:");
//        updatePrintSingleLine();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nGET USER INPUT FROM CONSOLE:");
//        getInputFromConsole();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nDISPLAY MESSAGE TO CONSOLE:");
//        showConsoleOutput();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("GET USER INPUT FROM A GUI");
//        getInputFromGui();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("SHOW A MESSAGE IN A GUI");
//        showMessageGui();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nIF CONSTRUCT:");
//        ifConstructExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nSWITCH CONSTRUCT:");
//        switchConstructExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nFOR LOOP CONSTRUCT:");
//        forConstructExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nFOR-EACH CONSTRUCT:");
//        forEachConstructExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nWHILE LOOP CONSTRUCT:");
//        whileConstructExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        System.out.println("\nDO-WHILE LOOP CONSTRUCT:");
//        doWhileConstructExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        SHOW HOW AN ACTION LISTENER IS WRITTEN
//        actionListenerExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        EXAMPLES OF HOW ARRAYS ARE WRITTEN
//        arrayExamples();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        EXAMPLE OF HOW ARRAY LISTS ARE WRITTEN
//        arrayListExamples();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        EXAMPLE OF HOW TO INITIALISE A GUI
//        GuiLayoutExample guiLayoutExample = new GuiLayoutExample();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

    private static void primitiveTypeExamples() {
//        byte range: +127 to -128
        byte b = 23;

//        char range: All unicode characters (char is only ever a single character)
        char c = 'A';

//        short range: +32,767 to -32,768
        short s = 23;

//        int range: +2,147,483,647 to -2,147,483,648
        int i = 23;

//        long range: +9,223,372,036,854,775,807 to -9,223,372,036,854,775,808
        long l = 23L;

//        float range: +3.402,823,5 E38 to -1.4 E45
        float f = 23f;

//        double range: +1.797,693,134,862,315,7 E308 to -4.9 E324
        double d = 23.23;

//        boolean range: true, false
        boolean b1 = true;
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void commonlyUsedClasses() {
//        - All classes in java start with CAPITALS
//        - All methods in java start with lowercase

//        - Class example: ThisIsAClass
//        - Not a class example: thisIsNot

        String string = "String";
        Scanner scanner;
        Integer integer = 1;
        Double d = 2.2;
        JOptionPane jOptionPane;
        JButton jButton;
        JLabel jLabel;
        JPanel jPanel;

//        This is for creating menu's within a JFrame
//        The JMenu is the object that holds the JMenuBar
        JMenu menu1;
//        The JMenuBar is the object that holds the JMenuItems
        JMenuBar menuBar;
//        The JMenuItem is the objects that are used to display options to a user
        JMenuItem jMenuItem1;

//        Other Classes That May Prove To Be Useful
        Font font = new Font("Verdana", Font.BOLD, 20);
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings({"ConstantConditions", "SpellCheckingInspection"})
    static void operatorExamples() {
//        Initialise variables for examples
        int num1 = 5;
        int num2 = 10;
        String string1 = "Test1";
        /**/
        String string2 = "Test2";
//=============================================================================
//        MATH OPERATORS:

        System.out.println("Math Operators:");

//        Addition
        System.out.println(num1 + num2);
//
//        Subtraction
        System.out.println(num1 - num2);
//
//        Multiplication
        System.out.println(num1 * num2);
//
//        Division
        System.out.println(num1 / num2);
//
//        Modulus (remainder)
        System.out.println(num1 % num2);
//
//        Increment
        System.out.println(++num1);
//
//        Decrement
        System.out.println(--num1);
//=============================================================================
//        ASSIGNMENT OPERATORS
        System.out.println("\nAssignment Operators:");

//        Straight assignment
        System.out.println(num1 = 500);

//        Addition assignment
        System.out.println(num1 += 500);

//        Subtraction assignment
        System.out.println(num1 -= 500);

//        Multiplication assignment
        System.out.println(num1 *= 500);

//        Division assignment
        System.out.println(num1 /= 500);

//        Modulus (remainder) assignment
        System.out.println(num1 %= 40);
//=============================================================================
//        RELATIONAL OPERATORS
        System.out.println("\nRelational Operators:");

//        Equality comparison of numbers
        System.out.println(num1 == num2);
//
//        Equality Comparison of strings
        System.out.println(string1.equals(string2));

//        Not equal to comparison
        /**/
        System.out.println(num1 != num2);

//        Greater than comparison
        System.out.println(num1 > num2);

//        Less than comparison
        System.out.println(num1 < num2);

//        Greater than or equal to comparison
        System.out.println(num1 >= num2);

//        Less than or equal to comparison
        System.out.println(num1 <= num2);
//=============================================================================
//        LOGICAL OPERATORS
        System.out.println("\nLogical Operators:");

//        Logical AND (True if both statements are true)
        System.out.println(num1 > 10 && num2 > 10);

//        Logical OR (True if one statement is true)
        System.out.println(num1 > 8 || num2 > 8);

//        Logical NOT (False if statements are true)
        System.out.println(!(num1 > 8 && num2 > 8));
//=============================================================================
//        ESCAPE CHARACTERS
        System.out.println("Newline        : " + "ABCDE\nFGHIJ");
        System.out.println("Carriage Return: " + "ABCDE\rFGHIJ");
        System.out.println("Single Quote   : " + "ABCDE\'FGHIJ");
        System.out.println("Double Quote   : " + "ABCDE\"FGHIJ");
        System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
        System.out.println("Backspace      : " + "ABCDE\bFGHIJ");
        System.out.println("Horizontal Tab : " + "ABCDE\tFGHIJ");
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void updatePrintSingleLine() {
//        Example of using carriage return to update print statement rather than make a new one
        for (int i = 0; i < 1000; i++) {
            System.out.print("Number is: " + i + "\r");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void getInputFromConsole() {
//        Initialise a scanner object names 'userInput'
        Scanner userInput = new Scanner(System.in);

//        Get an integer input
        System.out.println("Enter a number:");
        int number = userInput.nextInt();

//        Get a string input
        System.out.println("Enter a string:");
        String string = userInput.next();

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void showConsoleOutput() {
        System.out.println("Message to print to console goes here");
        System.out.printf("Print format strings with printf (%d %s)\n", 10, "string");
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void getInputFromGui() {
        String userInput = JOptionPane.showInputDialog(null, "Message to display goes here");
        String userInput2 = JOptionPane.showInputDialog(null, "<html>You can use <h2>HTML</h2> in the dialogues</html>");
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void showMessageGui() {
        JOptionPane.showMessageDialog(null, "Message to show goes here");
        JOptionPane.showMessageDialog(null, "<html>You can use <h2>HTML</h2> in the dialogues</html>");
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void ifConstructExample() {
//        Initialise an instance of a Random object and an int to store the number
        int randomNum;
        Random rand = new Random();
//        Get a random number from 0 to 4
        randomNum = rand.nextInt(5);

//        If constructs that check to see what number has been selected randomly by checking each possibility
        if (randomNum == 1) {
            System.out.printf("Number = %d\n", randomNum);
        } else if (randomNum == 2) {
            System.out.printf("Number = %d\n", randomNum);
        } else if (randomNum == 3) {
            System.out.printf("Number = %d\n", randomNum);
        } else if (randomNum == 4) {
            System.out.printf("Number = %d\n", randomNum);
        } else if (randomNum == 5) {
            System.out.printf("Number = %d\n", randomNum);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void switchConstructExample() {
//        Initialise an instance of a Random object and an int to store the number
        int randomNum;
        Random rand = new Random();
//        Get a random number from 0 to 4
        randomNum = rand.nextInt(5);

//        A switch construct is more efficient than an if construct and is easier to read in most cases
        switch (randomNum) {
            case 1:
                System.out.println("Number = 1");
                break;
            case 2:
                System.out.println("Number = 2");
                break;
            case 3:
                System.out.println("Number = 3");
                break;
            case 4:
                System.out.println("Number = 4");
                break;
            case 5:
                System.out.println("Number = 5");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void forConstructExample() {
//        For loop that prints the numbers 0 to 10 inclusive (declaration and assignment of 'i' done inside the for loop)
        for (int i = 0; i <= 5; i++) {
            System.out.println("Number = " + i);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void forEachConstructExample() {
//        For-Each loop that prints the numbers 0 to 10 inclusive (for-each loops are useful to iterate over everything in an array)
        int[] nums = {0, 1, 2, 3, 4, 5};
        for (int i : nums) {
            System.out.println("Number = " + i);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void whileConstructExample() {
//        While loop that prints the numbers 0 to 10 inclusive
        int i = 0;
        while (i <= 5) {
            System.out.println("Number = " + i);
            i++;
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void doWhileConstructExample() {
//        do-while loop that prints the numbers 0 to 10 inclusive (A do-while loop will always execute at least once)
        int i = 0;
        do {
            System.out.println("Number = " + i);
            i++;
        } while (i <= 5);
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void actionListenerExample() {
//        - An action listener runs when a corresponding event has been triggered, most likely within a GUI
//        - This action listener doesn't do anything, but shows the framework for how you would implement it after you have
//        added your action listener using 'variable.addActionListener(e -> methodToRun)'. The variable will usually be a swing component

        ActionListener listener = e -> {
//            The code you want to loop within the timer goes here
        };

//        This is the code to start the timer, it must go after the action listener event
        Timer timer = new Timer(100, listener);
        timer.start();
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void arrayExamples() {
//        - Arrays in java start at 0, therefore an array of length [3] has the possible index values of [0][1][2]
//        - Arrays in java are defined and given a set length
//        - The array can have less than the set length of values, but can never have more than the set length
//        - For a dynamic array that scale depending on the needed size, you must use an ArrayList

//        One dimensional Array example for primitive type with 5 possible values
        int[] nums = new int[5];

//        One dimensional Array Example for non-primitive type with 5 possible values
        String[] strings = new String[5];

//        Two dimensional Array example for primitive type with 15 possible values
        int[][] nums2 = new int[5][3];

//        Two dimensional Array Example for non-primitive type with 15 possible values
        String[][] strings2 = new String[5][3];
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private static void arrayListExamples() {
//        - ArrayList (s) can store a dynamic size of data and are much more versatile than normal one or two dimensional lists
//        - An ArrayList must specify the data type upon declaration, and they type CANNOT be a primitive, it MUST be a class

//        Example ArrayList Declarations:
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<JLabel> jLabels = new ArrayList<>();
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    static void guiDifferentClassCallExample() {
//        This method doesn't show how to do anything, just here to facilitate a GUI example
        System.out.println("This has been called from the 'GuiLayoutExample' Class ");
    }
}
