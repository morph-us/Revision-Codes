import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction{
	String run(String str);
}


class Test{
	public static void main(String args[]){
		StringFunction exclaim  = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";

		printFormatted("Hello",exclaim);
		printFormatted("Hello",ask);

		System.out.println(exclaim.run("hey"));

	}

	public static void printFormatted(String str,StringFunction format){
		String result = format.run(str);
		System.out.println(result);




	}
}
