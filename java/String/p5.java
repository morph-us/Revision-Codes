
 class Test{
	public static void main(String args[]){
			String str="      Om Namah Shivay!!!          ";


			String  str2 = str.trim();
			System.out.println(str2.equals(str.trim()));


			StringBuilder s = new StringBuilder(str2);

			System.out.println(str2.equals(s));

	}
}
