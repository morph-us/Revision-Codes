import java.util.*;
import java.io.*;


class Test{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers");	
		
		int flag=0,n1=0,n2=0;
		while(flag!=1){
		try{
			 n1 = Integer.parseInt(br.readLine());
			 n2 = Integer.parseInt(br.readLine());
			flag = 1;
		}
		catch(Exception e){
			System.out.println("Error "+ e.getMessage()+" \nplease enter two numbers");	
			}
		}

		System.out.println("N1 : "+n1);
		System.out.println("N2 : "+n2);


	}
}
