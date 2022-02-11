class Book{
	Book(){
		System.out.println("const");
	}

	public int toString(){
		System.out.println("reading book");
		return 0;

	}


	void fun(){
			super.toString();
			toString();
	}

	public static void main(String args[]){
		Book b = new Book();
		b.toString();
		
	}

}



