import java.util.*;



class Test{
	public static void main(String args[]){



		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st= new StringTokenizer(str);
	
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}



	}
}
