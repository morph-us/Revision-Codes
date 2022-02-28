#include<iostream>
using namespace std;

class A{
	int x = 10;

	public:
		A(){


			cout<<"Parent A public"<<endl;
		}

		A(int a){


			cout<<"Parent A para"<<endl;
		

	

		}

	int y = 20;

	protected:
	

	int z = 30;


};


class B: public A{
//	y = 40;

	A *ptr = new A(4);
	public:
		B(){
			cout<<"child b"<<endl;

		}


		void display(){
			
			cout<<z<<endl;
			cout<<y<<endl;
			cout<<ptr->y<<endl;
		}



};

int main(){
	B obj;
	
	obj.display();


	A a(3);

}
