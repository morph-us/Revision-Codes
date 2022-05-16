abstract class Functional{
	abstract void method(String args);


}


class Test{
	public static void main(String args[]){

		
		Functional obj = new Functional(){
			
			void method(String str){

			System.out.println(str);

			}
		};


		obj.method("hello");



	}



}
