#include<iostream>
using namespace std;

class A{


	public: 
		A(){
			cout<<"const A"<<endl;
	
		}

		void display(){

			cout<<"display A"<<endl;

		}


};


class B:protected A{


	public: 
		B(){
			cout<<"const B"<<endl;
			A();		
			//A obj;
		//	display();
		}


};


class C:public B{


	public: 
		C(){
			cout<<"const C"<<endl;
		//	A obj;
			
		//	display();
	
		}


};


int main(){
	C obj;
	
	



}
