
 class Test{
	public static void main(String args[]){
			String str="      Om Namah Shivay!!!          ";
			

			str = str.trim();
			String ar[] = str.split(" ");
			for(String a:ar){
				System.out.println(a);
			}

	}
}
