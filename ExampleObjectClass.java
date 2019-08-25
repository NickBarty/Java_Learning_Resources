class ExampleObjectClass {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //    Object Variables (Should be private, they shouldn't be accessed directly from an upper level outside this class, and ideally, a lower level either, but lower levels are OK if required)
    private boolean isObjectBoolean;
    private final int objectNum;
    private String objectName;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    Constructor for the ExampleObjectClass
    ExampleObjectClass(boolean isObjectBoolean, int objectNum, String objectName) {
//        OBJECT CLASS RULES & TIPS:
//        - The name of the object constructor method must match the class name (ExampleObjectClass)
//        - Every object variable defined in the parameter should be assigned a value in the same constructor
//        - You can auto-generate constructors after you have written your object variables using the shortcut ALT+Insert
        this.isObjectBoolean = isObjectBoolean;
        this.objectNum = objectNum;
        this.objectName = objectName;
    }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    OVERLOADING INFORMATION:
//    - The following is an overloaded constructor of the ExampleObjectClass, it is overloaded as it only takes 2 parameters
//    - Overloading allows you to create an object without a parameter for instances where you don't need all parameters to be filled
//    - In this case we have made the objectName value un-necessary and given it a default value
    ExampleObjectClass(boolean isObjectBoolean, int objectNum) {
        this.isObjectBoolean = isObjectBoolean;
        this.objectNum = objectNum;

//        - You can assign the un-used parameters to a default value if required
//        - You don't need to assign default values as the upper level constructor will assign it the top level default value
        this.objectName = "BLANK";
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //    The following are GETTERS and SETTERS, every object should have them as required and can be generated using ALT+Insert

    //    Setters for the boolean that can be accessed through the object's methods
    void setObjectBoolean() {
        isObjectBoolean = false;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    //    Getters that can be accessed through the object methods
    boolean isObjectBoolean() {
        return isObjectBoolean;
    }

    int getObjectNum() {
        return objectNum;
    }

    String getObjectName() {
        return objectName;
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
