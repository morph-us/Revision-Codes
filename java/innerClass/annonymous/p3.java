class X{
	void m1(){
		System.out.println("in m1");
	}
}


class Test{
	public static void main(String args[]){
		X x = new X(){
			public final static int val = 10;
			 void m2(){
				System.out.println("in m2");
			}
			
			 void m1(){

				 class Demo{
				 int b = 50;

			}


				System.out.println(" statement in overridden m1");
				System.out.println(val);
				Demo d = new Demo();
				System.out.println(d.b);


 			
			}	

			
		};

		x.m1();
	//	System.out.println(x.val);




	}
}
