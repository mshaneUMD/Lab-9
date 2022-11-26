package generic;

public class GenericDemo03 {

	public static void main(String[] args) {
        //implementation1
        GenericInterfaceImplementation1 genericInterfaceImpl1 = new GenericInterfaceImplementation1();
        // coding starting here

        // Send a String to the method in this interface.
        genericInterfaceImpl1.method("can only transmit string type here");

	// coding ending here


        //implementation2
        GenericInterfaceImplementation2<String> stringGenericInterfaceImpl2 = new GenericInterfaceImplementation2<>();
        // coding starting here

        // Send a String to the method in this interface.
        stringGenericInterfaceImpl2.method("transmit string");

	// coding ending here

        GenericInterfaceImplementation2<Integer> integerGenericInterfaceImpl2 = new GenericInterfaceImplementation2<>();
        // coding starting here

        // Send an integer to the method in this interface.
        integerGenericInterfaceImpl2.method(111);

	// coding ending here;
    }

}
