// Java code to show use of double colon operator
// for static methods

import java.util.*;

class GFG {

	// static function to be called
	 void someFunction(String s)
	{
		System.out.println(s+".");
	}

	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");

		// call the static method
		// using double colon operator
		list.forEach(new GFG()::someFunction);
	}
}

