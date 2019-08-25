class CallMethodsFromOtherClassesExample {
    public static void main(String[] args) {
//        State the class you want the method from, then call the method you want
        AllConcepts.operatorExamples();

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        Declare and assign an ExampleObjectClass object
        ExampleObjectClass exampleObjectClass = new ExampleObjectClass(true, 1, "Test");

//        Example using overloaded constructor of the ExampleObjectClass
        ExampleObjectClass exampleObjectClassOverload = new ExampleObjectClass(true, 1);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        Uses the getter methods to print the name, number and boolean set in the constructor above
        System.out.println(exampleObjectClass.getObjectName());
        System.out.println(exampleObjectClass.getObjectNum());
        System.out.println(exampleObjectClass.isObjectBoolean());
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//        Uses the setter method to change the object's boolean value to false, then uses the getter method to print the change
        exampleObjectClass.setObjectBoolean();
        System.out.println(exampleObjectClass.isObjectBoolean());
    }
}
