package generic;

public class GenericDemo02 {

	public static void main(String[] args) {
        //create an instance of the class including generic method
        GenericMethod genericMethod = new GenericMethod();
        //call generic method
        //transmit any type of arguments into method
        genericMethod.method(11);
        // coding starting here

        // Send a String to the method.
        genericMethod.method("string type");

        // Send a boolean to the method.
        genericMethod.method(true);

        // Send a double to the method.
        genericMethod.method(33.3333);

        // Print a line.
        genericMethod.method("-------------------------------");

	// coding ending here


        //static method cannot be called by an object
        //static method is called by class
        GenericMethod.method2("can be any data type");
        // coding starting here

        // Send an integer to the static method.
        GenericMethod.method2(333);

        // Send a boolean to the static method
        GenericMethod.method2(false);

        // Print a line.
        GenericMethod.method2("-------------------------------");

	// coding ending here

    }

}
