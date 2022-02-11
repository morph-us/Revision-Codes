class X{
	int a =30;
	void fun(){

		int a =20;
		class Y{
			 int a =10;

			void fun(int a){
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(X.this.a);

			}				

			

		}

		Y obj = new Y();
		obj.fun(a);


	}


	public static void main(String args[]){
			X obj = new X();
			obj.fun();


	}



}
