class X{
	int a =30;
	void fun(int num){

		int a =20;
		class Y{
			 int a =10;

			void fun(int a){
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(X.this.a);
				//System.out.println(num);


			}				

			

		}

		Y obj = new Y();
		obj.fun(a);// when there are a lot of same name variables, local method variables can be passed as paramters
		/*
			However, starting in Java SE 8, a local class can access local variables and
			parameters of the enclosing block that are final or effectively final. 
			A variable or parameter whose value is never changed after
			it is initialized is effectively final.

		*/

	}


	public static void main(String args[]){
			X obj = new X();
			obj.fun(25);


	}



}
