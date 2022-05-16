
 class Test{
	public static void main(String args[]){
			String str="         Om Namah Shivay!!!             ";


			String  str2 = str.trim();


			System.out.println(str2);
			System.out.println(str);

			System.out.println(str2.equals(str));
			System.out.println(str);



			StringBuilder s = new StringBuilder(str2);

			System.out.println(str2.equals(s));
	

			s.append("h");
			System.out.println(s.equals(s.append("l")));

			System.out.println(s);
				
			StringBuffer sb = new StringBuffer(str2);

			sb.append("k");
			
			System.out.println(sb);
				
	}
}
