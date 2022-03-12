import java.util.stream.*;

class GFG {
	public static void main(String[] args)
	{

		// Get the stream
		Stream<String> stream
			= Stream.of("Geeks", "For",
						"Geeks", "A",
						"Computer",
						"Portal");

		// Print the stream
		stream.forEach(System.out::print);
	}
}

