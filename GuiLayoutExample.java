import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// This class:
// - MUST extend JFrame to be a GUI layout
// - MUST implement KeyListener class to take advantage of the "keyTyped" / "keyPressed" / "keyReleased" methods
// - The "key..." methods are used to capture keyboard events within a GUI
public class GuiLayoutExample extends JFrame implements KeyListener {
    GuiLayoutExample() {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//       Setting up JComponents that we will use

//        Set the name of window
        super("Example GUI Layout");

//    This toolkit is used to get dimensions of the screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

//        Declaration and initialisation for a JPanel
        JPanel examplePanel = new JPanel(new BorderLayout(5, 5));

//        Declaration and initialisation for a JLabel
        JLabel exampleLabel = new JLabel("Example Label", SwingConstants.CENTER);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        SETTING UP A MENU
//        Menus require 3 things:
//          1) JMenuBar - This is the bar that is displayed at the top of the JFrame
//          2) JMenu - These are the headings within the JMenuBar
//          3) JMenuItem - These are the headings / items within a JMenu
//        Only one JMenuBar can exist on a JFrame a a time, but multiple JMenu's that have multiple JMenuItems can exist with the one JMenuBar

//        Declaration and initialisation of a JMenuBar
        JMenuBar mainBar = new JMenuBar();

//        Declaration and initialisation of 2 JMenu's
        JMenu menu1 = new JMenu("Example Menu 1");
        JMenu menu2 = new JMenu("Example Menu 2");

//        Declaration and initialisation of 4 JMenu items
        JMenuItem exampleItem1 = new JMenuItem("Example Menu Item 1");
        JMenuItem exampleItem2 = new JMenuItem("Example Menu Item 2");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem callOtherClassMethod = new JMenuItem("Call Other Class Method Example (Prints message to console)");


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//      EVERYTHING FROM HERE ONWARDS IS LAYOUT SETUP - EVERYTHING ABOVE IS LAYOUT OBJECT INITIALISATION
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        The below commented line sets a GUI layout, more than FlowLayout exits, however, this is just an example of how a layout is set
//        setLayout(new FlowLayout());
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        This sets the font to be used. This example sets the font for the JFrame, but this method can be used on individual JComponents such as JPanel's or JLabels
        setFont(new Font("Verdana", Font.PLAIN, 20));
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        This sets the menu bar that is displayed up the top of the JFrame and adds the JMenu's we initialised to it
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        Adds a key listener to the JFrame
        addKeyListener(this);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        This adds our initialised JComponents to our initialised JMenu's
        menu1.add(exampleItem1);
        menu1.add(exit);
//        ACTION LISTENER EXAMPLE
        exit.addActionListener(e -> exit());

        menu2.add(exampleItem2);
        menu2.add(callOtherClassMethod);
//        CALL METHOD IN OTHER CLASS EXAMPLE
        callOtherClassMethod.addActionListener(e -> setCallOtherClassMethod());
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        This creates a Dimension object that can be used to set the size of JPanels
//        This can be used when you use a layout such as a FlowLayout where objects in the GUI will try to stretch to the preferred size
        Dimension preferredPanelSize = new Dimension();
//        Using a FlowLayout with JPanels set to use the size set below will result in 3 panels per row
        preferredPanelSize.setSize((getWidth() / 3) - 5, 150);

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        SETTING UP A PANEL:
//        Because no layout has been set, this panel will take up the entire JFrame when it is added
        add(examplePanel);

//        This sets the panel to have a black border with a slight thickness. BorderFactory has more than just line borders if you desire a different border
        examplePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

//        Both of the size setting methods do nothing in this instance as no layout has been set, but when using layouts either method will do something:
//
//        .setPreferredSize - Takes a Dimension object and makes the panel that size, this is useful for a flow layout.
//          - E.g. set each panel to a Dimension object equal to 1/5th the JFrame dimension, which will mean you will get 5 panels in one 'row' of the flow. Very dynamic approach to GUI layout
//
//        .setSize - Takes integer literals to set the width / height. Very static approach to GUI design
        examplePanel.setPreferredSize(preferredPanelSize);
        examplePanel.setSize(200, 200);

//        This adds a label to the panel. The 'add()' method can be used to add any swing GUI element that extends from the JComponent class
        examplePanel.add(exampleLabel, BorderLayout.CENTER);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        This method is a NECESSITY, the GUI will not display without it
        setVisible(true);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        This method ensures that when the frame is closed it is also exits the application in java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        The next 4 lines sets the size of the JFrame and then centers it on the screen
        setSize(1000, 1000);
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

    private void exit() {
//        This calls the System.exit method with closes and exits the application
        System.exit(0);
    }

    private void setCallOtherClassMethod() {
//        This method just prints a message to the console
//        Best practise of calling another class from within the layout class is to:
//          1) Have a method in the layout class that is attached to an 'actionListener' (like this method is)
//          2) Have that method call 'YourClass.yourMethod();'
        AllConceptExamples.guiDifferentClassCallExample();
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        IMPORTANT: ENSURE "addKeyListener(this); IS IN THE LAYOUT SETUP OR KEY EVENTS WILL NOT WORK!!!!!!!!!!!!
//        The following is an example of how to use keyboard input of '1' to execute the same method the second button in the second menu does
//        Pressing '1' on a keyboard will print a message to the console

//        declares and initialises a char object to the KeyEvent
        char c = e.getKeyChar();

//        This example uses a method within this class
        if (c == '1') {
            setCallOtherClassMethod();
        }

//        This example uses a static method within a different class.
//        This is an advantage of key input, you don't have to have a method in this class that calls another method in a different class like JMenu components do
        if (c == '2') {
            AllConceptExamples.guiDifferentClassCallExample();
        }
//        If you want more keys to execute the same or different methods just add more 'if' conditions with different keys
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    The two methods 'keyPressed' and 'keyReleased' can be used, but usually 'keyTyped' is sufficient
//    These two unused methods are required to be here due to this class implementing KeyListener
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}