// Java code to show use of double colon operator
// for static methods

import java.util.*;

class GFG {

	// static function to be called
	static void someFunction(int s)
	{
		System.out.println(s+".");
	}

	public static void main(String[] args)
	{

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(8);

		// call the static method
		// using double colon operator
		list.forEach(GFG::someFunction);
	}
}

