class X{
	void m1(){
		System.out.println("in m1");
	}
}


class Test{
	public static void main(String args[]){
		X x = new X(){
			static void m2(){
				System.out.println("in m2");
			}
			
			 void m1(){

				System.out.println(" statement in overridden m1");

			}	

		};

		x.m1();




	}
}
