// Java code to show use of double colon operator
// for super methods

import java.util.*;
import java.util.function.*;

class Test {

	// super function to be called
	protected static String print(String str)
	{
		return ("Hello " + str + "\n");
	}
}

class GFG extends Test {

	// instance method to override super method
	
	static void printm(String s)
	{

		// call the super method
		// using double colon operator
		Function<String, String>
			func = Test::print;

		String newValue = func.apply(s);
		newValue += "Bye " + s + "\n";
		System.out.println(newValue);


	}

	// Driver code
	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");

		// call the instance method
		// using double colon operator
		list.forEach(GFG::printm);
	}



}

