
class Test{
	public static void main(String args[]){
		String s1="hello";
		String s2=s1.intern();  
		String s3="hello";  
		System.out.println(s1==s2); 
		System.out.println(s2==s3);  

	}
}
