class ExampleObjectClassChild extends ExampleObjectClass {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //    - This is an example of a child class, it will contain everything from the extended class + any extra variables you define (INHERITANCE)
    //    - Both of the overloaded constructors are also present within this class. Every child class needs to have the parent constructors in a super keyword

    //    CHILD CLASS VARIABLES:
    private int childIntExample;
    private double childDoubleExample;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    The following constructors use 'super()' to inherit the values of the upper level class
    public ExampleObjectClassChild(boolean isObjectBoolean, int objectNum, String objectName) {
        super(isObjectBoolean, objectNum, objectName);

//        These values are the child values, each child object will have them
        this.childIntExample = 0;
        this.childDoubleExample = 0.0;
    }

    public ExampleObjectClassChild(boolean isObjectBoolean, int objectNum) {
        super(isObjectBoolean, objectNum);
        this.childIntExample = 0;
        this.childDoubleExample = 0.0;

//        This is an in-line child variable, it is used when only one instance of a child variable is required
        String objectName = "ExampleName";
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
