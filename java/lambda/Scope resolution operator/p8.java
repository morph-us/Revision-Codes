// Java code to show use of double colon operator
import java.util.*;
import java.util.function.*;
class GFG extends Test {

	// instance method to override super method
	@Override
	String print(String s)
	{

		// call the super method
		// using double colon operator
		Function<String, String>
			func = this::fun;

		String newValue = func.apply(s);
		newValue += "Bye " + s + "\n";
		System.out.println(newValue);

		return newValue;
	}


	String fun(String str)
	{
		return ("Hello " + str + "\n");
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
		list.forEach(new GFG()::print);
	}
}

