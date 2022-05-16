import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction{
	String run(String str);
}


class Test{
	public static void main(String args[]){
		StringFunction exclaim  = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";

		System.out.println(exclaim.run("Hello"));
		System.out.println(ask.run("Hello"));


	}
}
