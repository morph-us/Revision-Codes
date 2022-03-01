#include<iostream>
using namespace std;

class A{


	protected: 
		A(){
			cout<<"const A"<<endl;
	
		}

		void display(){

			cout<<"display A"<<endl;

		}


};


class B:private A{


	public: 
		B(){
			cout<<"const B"<<endl;
			A();		
		//	A obj;
		//	display();
		}

	protected:
		B(int a){
	//		A();

		}	


};


class C:public B{


	public: 
		C(){
			cout<<"const C"<<endl;
//			A obj;
//			A();
		//	display();
	
		}


};


int main(){
	C obj;
	
	



}
