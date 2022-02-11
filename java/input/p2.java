import java.util.*;

class Test{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		
		for(String a:arr){
			System.out.println(a);
		}

	}
}
