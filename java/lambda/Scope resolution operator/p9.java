// Java code to show use of double colon operator
// for instance method of arbitrary type

import java.util.*;

class Test {
	String str=null;
	Test(String s)
	{
		this.str=s;
	}
	// instance function to be called
	void someFunction()
	{
		System.out.println(this.str);
	}
}

class GFG {

	public static void main(String[] args)
	{

		List<Test> list = new ArrayList<Test>();
		list.add(new Test("Geeks"));
		list.add(new Test("For"));
		list.add(new Test("GEEKS"));

		// call the instance method
		// using double colon operator
		list.forEach(Test::someFunction);
	}
}

